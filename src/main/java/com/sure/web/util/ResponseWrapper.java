package com.sure.web.util;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import com.sure.web.exception.RetailException;

public class ResponseWrapper<T> implements Serializable {

	  private static final long serialVersionUID = 1L;
	  private RetailException retailException;
	  private HttpStatus statusCode;
	  private String message;
	  private T data;

	  public ResponseWrapper() {
	    // Default constructor
	  }

	  public ResponseWrapper(RetailException retailException) {
	    super();
	    this.retailException = retailException;
	  }

	  public RetailException getRetailException() {
	    return retailException;
	  }

	  public void setRetailException(RetailException retailException) {
	    this.retailException = retailException;
	  }

	  public ResponseWrapper(RetailException retailException, HttpStatus statusCode, String message,
	      T data) {
	    super();
	    this.retailException = retailException;
	    this.statusCode = statusCode;
	    this.message = message;
	    this.data = data;
	  }

	  /**
	   * Method to get Retail Error
	   * 
	   * @return {@link HttpStatus}
	   */
	  public HttpStatus getStatusCode() {
	    return statusCode;
	  }

	  /**
	   * Method to set Status Code
	   * 
	   * @param statusCode
	   */
	  public void setStatusCode(HttpStatus statusCode) {
	    this.statusCode = statusCode;
	  }

	  /**
	   * Method to get Retail Error
	   * 
	   * @return {@link String}
	   */
	  public String getMessage() {
	    return message;
	  }

	  /**
	   * Method to set Message
	   * 
	   * @param message
	   */
	  public void setMessage(String message) {
	    this.message = message;
	  }

	  /**
	   * Method to get Data
	   * 
	   * @return {@link T}
	   */
	  public T getData() {
	    return data;
	  }

	  /**
	   * Method to set data
	   * 
	   * @param data
	   */
	  public void setData(T data) {
	    this.data = data;
	  }
	}
