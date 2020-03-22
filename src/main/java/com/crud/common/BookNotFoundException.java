package com.crud.common;

public class BookNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BookNotFoundException(String message) {
		super(message);
	}

	public BookNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public BookNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BookNotFoundException(Throwable arg0) {
		super(arg0);
	}

}
