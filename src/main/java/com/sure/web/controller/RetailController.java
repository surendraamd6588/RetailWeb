package com.sure.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sure.web.form.ProductDetailsForm;
import com.sure.web.form.ResultForm;
import com.sure.web.form.UserDetailsForm;
import com.sure.web.service.ProductService;
import com.sure.web.service.UserService;
import com.sure.web.util.ResponseWrapper;

@RestController
@RequestMapping("/retail")
public class RetailController {
	
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RetailController.class);
	
	@ResponseBody
	@RequestMapping(value="/saveuser",method = RequestMethod.POST)
	public ResponseWrapper<UserDetailsForm> saveUser(@RequestBody UserDetailsForm userDetailsForm){
		LOGGER.info("RetailController saveUser method Start.>> TimeStamp: "+ System.currentTimeMillis());
		UserDetailsForm userDetailsFormdata=userService.insertUser(userDetailsForm);
		
		LOGGER.info("RetailController saveUser method End.>> TimeStamp: "+ System.currentTimeMillis());
		
		return new ResponseWrapper<UserDetailsForm>(null, HttpStatus.OK, "", userDetailsFormdata);
		
		
	}
	
	@ResponseBody
	@RequestMapping(value="/saveproduct",method = RequestMethod.POST)
	public ResponseWrapper<ProductDetailsForm> saveProduct(@RequestBody ProductDetailsForm productDetailsForm){
		LOGGER.info("RetailController saveProduct method Start.>> TimeStamp: "+ System.currentTimeMillis());
		//UserDetailsForm userDetailsFormdata=userService.insertUser(userDetailsForm);
		ProductDetailsForm productDetailsFormdata=productService.insertproduct(productDetailsForm);
		
		LOGGER.info("RetailController saveProduct method End.>> TimeStamp: "+ System.currentTimeMillis());
		
		return new ResponseWrapper<ProductDetailsForm>(null, HttpStatus.OK, "", productDetailsFormdata);
		
		
	}
	
	@ResponseBody
	@RequestMapping(value="/getdiscount/{id}",method = RequestMethod.GET)
	public ResponseWrapper<ResultForm> getDiscount(@PathVariable long id){
		LOGGER.info("RetailController saveProduct method Start.>> TimeStamp: "+ System.currentTimeMillis());
		//UserDetailsForm userDetailsFormdata=userService.insertUser(userDetailsForm);
		ResultForm resultForm=userService.getDiscountService(id);
		
		LOGGER.info("RetailController saveProduct method End.>> TimeStamp: "+ System.currentTimeMillis());
		
		return new ResponseWrapper<ResultForm>(null, HttpStatus.OK, "", resultForm);
		
		
	}

}
