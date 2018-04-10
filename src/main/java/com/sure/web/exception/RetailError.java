package com.sure.web.exception;

/**
 * @author Surendra Kumar
 * @purpose This class is used to throw exception.
 */

public class RetailError {

	  private final String field;
	  private final String reasonHeader;
	  private final String reason;

	  /**
	   * This is the constructor used for RetailError
	   * 
	   * @param field
	   * @param reasionHeader
	   * @param reason
	   */
	  public RetailError(String field, String reasonHeader, String reason) {
	    super();
	    this.field = field;
	    this.reasonHeader = reasonHeader;
	    this.reason = reason;
	  }

	  /**
	   * Method to get Field
	   * 
	   * @return {@link String}
	   */
	  public String getField() {
	    return field;
	  }

	  /**
	   * Method to get Reason Header
	   * 
	   * @return {@link String}
	   */
	  public String getReasonHeader() {
	    return reasonHeader;
	  }

	  /**
	   * Method to get Reason
	   * 
	   * @return {@link String}
	   */
	  public String getReason() {
	    return reason;
	  }

	  @Override
	  public String toString() {
	    return "RetailError [field=" + field + ", reasonHeader=" + reasonHeader + ", reason=" + reason
	        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
	        + super.toString() + "]";
	  }


	}
