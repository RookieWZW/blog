package com.RookieWZW.spring.boot.blog.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����5:02:00 ��˵��
 */
public class ConstraintViolationExceptionHandler {

	public static String getMessage(ConstraintViolationException e) {
		List<String> msgList = new ArrayList<>();

		for (ConstraintViolation<?> constrainViolation : e.getConstraintViolations()) {
			msgList.add(constrainViolation.getMessage());
		}

		String message = StringUtils.join(msgList.toArray(), ";");

		return message;
	}
}
