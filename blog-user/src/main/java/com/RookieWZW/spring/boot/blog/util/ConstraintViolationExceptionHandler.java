package com.RookieWZW.spring.boot.blog.util;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.apache.commons.lang3.StringUtils;

/**
 * @author RookieWZW
 * @version 创建时间：2018年8月4日 下午5:02:00 类说明
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
