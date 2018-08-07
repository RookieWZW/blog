package com.RookieWZW.spring.boot.blog.vo;

/**
 * @author RookieWZW
 * @version ����ʱ�䣺2018��8��4�� ����5:00:24 ��˵��
 */
public class Response {

	private boolean success;
	private String message;
	private Object body;

	/** ��Ӧ�����Ƿ�ɹ� */
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	/** ��Ӧ�������Ϣ */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/** ��Ӧ����ķ������� */
	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	public Response(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public Response(boolean success, String message, Object body) {
		this.success = success;
		this.message = message;
		this.body = body;
	}

}
