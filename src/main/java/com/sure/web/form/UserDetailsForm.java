package com.sure.web.form;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.sure.web.enitity.ProductDetails;


public class UserDetailsForm implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long userId;
	
	private String userName;
	
	private String userType;
	
	private Date userCreateDate;
	
	private Date userUpdateDate;	
	
    private long productId;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getUserCreateDate() {
		return userCreateDate;
	}

	public void setUserCreateDate(Date userCreateDate) {
		this.userCreateDate = userCreateDate;
	}

	public Date getUserUpdateDate() {
		return userUpdateDate;
	}

	public void setUserUpdateDate(Date userUpdateDate) {
		this.userUpdateDate = userUpdateDate;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	
	    
    

}
