package com.sure.web.form;

import java.io.Serializable;
import java.util.Set;

import com.sure.web.enitity.UserDetails;

public class ProductDetailsForm implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long productId;
	
	private String productName;
	
	private String productType;
	
	private long productCost;
	
	//private Set<UserDetails> userDetails;

	/*public Set<UserDetails> getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(Set<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}*/

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public long getProductCost() {
		return productCost;
	}

	public void setProductCost(long productCost) {
		this.productCost = productCost;
	}
	
	

}
