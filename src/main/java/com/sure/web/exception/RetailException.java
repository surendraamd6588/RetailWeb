package com.sure.web.exception;

import java.util.List;

/**
 * @author Surendra Kumar
 * @purpose This class is used to throw exception.
 */

public class RetailException extends RuntimeException {
  
  private static final long serialVersionUID = 1L;
  
  private final String errorCode;
  private final String msg;
  private final transient List<RetailError> retailError;
  
  
  /**
   * This is the constructor used for RetailException
   * 
   * @param errorCode
   * @param msg
   * @param retailError
   */

  public RetailException(String errorCode, String msg, List<RetailError> retailError) {
    super();
    this.errorCode = errorCode;
    this.msg = msg;
    this.retailError = retailError;
  }


  /**
   * Method to get List of RetailError
   * 
   * @return {@link List<RetailError>}
   */
  public List<RetailError> getRetailError() {
    return retailError;
  }

  /**
   * Method to get Msg
   * 
   * @return {@link String}
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * Method to get Error Code
   * 
   * @return {@link String}
   */
  public String getMsg() {
    return msg;
  }


  @Override
  public String toString() {
    return "RetailException [errorCode=" + errorCode + ", msg=" + msg + ", retailError="
        + retailError + "]";
  }


}
