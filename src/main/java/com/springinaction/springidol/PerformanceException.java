package com.springinaction.springidol;

public class PerformanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public PerformanceException(String message, Throwable cause) {
		super(message, cause);
	}

	public PerformanceException(String message) {
		super(message);
	}

	public PerformanceException(Throwable cause) {
		super(cause);
	}
}
