package com.sure.web.service;

import org.springframework.stereotype.Service;

import com.sure.web.form.ProductDetailsForm;

@Service
public interface ProductService {
	
	public ProductDetailsForm insertproduct(ProductDetailsForm productDetailsForm);
	

}
