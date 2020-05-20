package com.example.framwork.exception;

public class AppException extends Exception{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionId;

	public AppException(String exceptionId) {
		super();
		this.exceptionId = exceptionId;
	}
	
	public AppException() {
		super();
		this.exceptionId=null;
	}
}
