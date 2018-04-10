package com.sure.web.mapper;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;



import com.sure.web.enitity.UserDetails;

import com.sure.web.form.UserDetailsForm;

public class UserMapper {
	
	public static UserDetails mapDomainToForm(UserDetailsForm userDetails) {
		UserDetails userDetailsdata = new UserDetails();
		userDetailsdata.setUserId(userDetails.getUserId());
		userDetailsdata.setUserName(userDetails.getUserName());
		userDetailsdata.setUserType(userDetails.getUserType());
		if(userDetails.getUserCreateDate()==null)
			userDetailsdata.setUserCreateDate(new Date());
		userDetailsdata.setUserUpdateDate(userDetails.getUserUpdateDate());
		userDetailsdata.setProductId(userDetails.getProductId());
			
		return userDetailsdata;
	}
	
	public static UserDetailsForm mapFormToDomain(UserDetails userDetails) {
		
		UserDetailsForm userDetailsForm = new UserDetailsForm();
		userDetailsForm.setUserId(userDetails.getUserId());
		userDetailsForm.setUserName(userDetails.getUserName());
		userDetailsForm.setUserType(userDetails.getUserType());
		userDetailsForm.setUserCreateDate(userDetails.getUserCreateDate());
		userDetailsForm.setUserUpdateDate(userDetails.getUserUpdateDate());
		userDetailsForm.setProductId(userDetails.getProductId());
		
		return userDetailsForm;
	
	}
	
		
	public static List<UserDetailsForm> mapDomainListToFormList(List<UserDetails> userDetails) {
	 	   List<UserDetailsForm> resultForm = new ArrayList<UserDetailsForm>();
	 	   for (UserDetails UserDetailsdata : userDetails) {
	 		  resultForm.add(mapFormToDomain(UserDetailsdata));
	 	   }
	 	   return resultForm;

	    }

	

}
