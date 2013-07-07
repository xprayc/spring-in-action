package com.springinaction.knights;

public class QuestException extends Exception {

	private static final long serialVersionUID = 414204497716724706L;

	public QuestException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuestException(String message) {
		super(message);
	}

	public QuestException(Throwable cause) {
		super(cause);
	}

}
