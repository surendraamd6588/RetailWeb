package com.sure.web.enitity;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;





@Entity
@Table(name="USERDETAILS")
public class UserDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="USER_ID")
	private long userId;
	@Column(name="USER_NAME")
	private String userName;	
	@Column(name="USER_TYPE")
	private String userType;
	@Column(name="USER_CREATE_DATE")
	private Date userCreateDate;
	@Column(name="USER_UPDATE_DATE")
	private Date userUpdateDate;
	//@Column(name="PRODUCT_ID" )
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "PRODUCT_ID")
	@Column(name = "PRODUCT_ID")
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
