package com.example.framwork.exception;

public class EmptyReportException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyReportException() {
		super();
	}
	
	public EmptyReportException(String exceptionId) {
		super(exceptionId);
	}
}
