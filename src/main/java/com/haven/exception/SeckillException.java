package com.haven.exception;

/**
 * ��ɱҵ������쳣
 */
public class SeckillException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

	public SeckillException(String message) {
		super(message);
	}

	
	
}