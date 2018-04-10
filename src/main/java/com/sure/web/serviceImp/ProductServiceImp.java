package com.sure.web.serviceImp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sure.web.enitity.ProductDetails;
import com.sure.web.form.ProductDetailsForm;
import com.sure.web.mapper.ProductMapper;
import com.sure.web.repo.ProductRepo;
import com.sure.web.repo.RetailRepo;
import com.sure.web.service.ProductService;

@Service
public class ProductServiceImp implements ProductService{

	@Autowired
	RetailRepo retailRepo;
	
	@Autowired
	ProductRepo productRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImp.class);
	@Override
	public ProductDetailsForm insertproduct(ProductDetailsForm productDetailsForm) {

		LOGGER.info("ProductServiceImp insertproduct method Start.>> TimeStamp: "
				+ System.currentTimeMillis() + "with parameter productDetailsForm " + "and productDetailsForm  " + productDetailsForm.toString());
		
		ProductDetails userDetails=ProductMapper.mapDomainToForm(productDetailsForm);
		ProductDetails userData=productRepo.saveAndFlush(userDetails);
		
		LOGGER.info("ProductServiceImp insertproduct method End.>> TimeStamp: "
				+ System.currentTimeMillis() + "with parameter UserDetails " + "and UserDetails  " + userData.toString());
		
		return ProductMapper.mapFormToDomain(userData);
	}

}
