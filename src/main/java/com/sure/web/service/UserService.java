package com.sure.web.service;

import org.springframework.stereotype.Service;

import com.sure.web.form.ResultForm;
import com.sure.web.form.UserDetailsForm;

@Service
public interface UserService {
	
	public UserDetailsForm insertUser(UserDetailsForm productDetailsForm);
	public ResultForm getDiscountService(long id);
	
	

}
