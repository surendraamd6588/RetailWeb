package com.sure.web.serviceImp;


import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sure.web.enitity.ProductDetails;
import com.sure.web.enitity.UserDetails;
import com.sure.web.form.ResultForm;
import com.sure.web.form.UserDetailsForm;
import com.sure.web.mapper.ResultMapper;
import com.sure.web.mapper.UserMapper;
import com.sure.web.repo.ProductRepo;
import com.sure.web.repo.RetailRepo;
import com.sure.web.service.UserService;
import com.sure.web.util.DiscountCalculator;

@Service
public class UserServiceImp implements UserService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImp.class);
	
	@Autowired
	RetailRepo retailRepo;
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public UserDetailsForm insertUser(UserDetailsForm productDetailsForm) {
		
		LOGGER.info("UserServiceImp insertUser method Start.>> TimeStamp: "
				+ System.currentTimeMillis() + "with parameter productDetailsForm " + "and productDetailsForm  " + productDetailsForm.toString());
		
		UserDetails userDetails=UserMapper.mapDomainToForm(productDetailsForm);
		UserDetails userData=retailRepo.saveAndFlush(userDetails);
		
		LOGGER.info("UserServiceImp insertUser method End.>> TimeStamp: "
				+ System.currentTimeMillis() + "with parameter UserDetails " + "and UserDetails  " + userData.toString());
		
		return UserMapper.mapFormToDomain(userData);
	}

	@Override
	public ResultForm getDiscountService(long id) {
		LOGGER.info("UserServiceImp getDiscountService method Start.>> TimeStamp: "
				+ System.currentTimeMillis() + "with parameter id " + "and id  " +id);
		
		//long productid=userDetailsForm.getProductId();
		UserDetails userDetails=retailRepo.findUserById(id);
		UserDetailsForm userForm=UserMapper.mapFormToDomain(userDetails);
		long productId=userDetails.getProductId();
		
		ProductDetails productDetails=productRepo.findProductById(productId);
		String productType=productDetails.getProductType();
		long totalcost=productDetails.getProductCost();
		Date usercredate=userDetails.getUserCreateDate();
		String userType=userDetails.getUserType();
		Date date = new Date();  
		
		if(productType.equalsIgnoreCase("groceries")){
			int discountonbil=0;
			long actualprice=0;
			if(totalcost>=100){
				discountonbil=DiscountCalculator.getDiscountByDoller(totalcost);
			}
			
			actualprice=totalcost-discountonbil;
			
			return ResultMapper.mapFormToDomainForGroceries(userForm,discountonbil,totalcost,productType,actualprice);
			
		}
			
		else{
			
			if(userDetails.getUserType().equalsIgnoreCase("employee")){
				int discount=DiscountCalculator.getDiscountBypercentage(totalcost, userType);
				int discountonbil=0;
				int totaldiscount=0;
				long actualprice=0;
				if(totalcost>=100){
					discountonbil=DiscountCalculator.getDiscountByDoller(totalcost);
					totaldiscount=discount+discountonbil;
				}else
					totaldiscount=discount;
				actualprice=totalcost-totaldiscount;
				
				return ResultMapper.mapFormToDomainForNormalProduct(userForm,totaldiscount,totalcost,productType,actualprice);
				
			}else if (userDetails.getUserType().equalsIgnoreCase("exemployee") ) {
				int discount=DiscountCalculator.getDiscountBypercentage(totalcost, userType);
				int discountonbil=0;
				int totaldiscount=0;
				long actualprice=0;
				if(totalcost>=100){
					discountonbil=DiscountCalculator.getDiscountByDoller(totalcost);
					totaldiscount=discount+discountonbil;
				}else
					totaldiscount=discount;
				actualprice=totalcost-totaldiscount;
				
				return ResultMapper.mapFormToDomainForNormalProduct(userForm,totaldiscount,totalcost,productType,actualprice);
				
				
			}else if (usercredate.before(date)) {
				int discount=DiscountCalculator.getDiscountBypercentage(totalcost, userType);
				int discountonbil=0;
				int totaldiscount=0;
				long actualprice=0;
				if(totalcost>=100){
					discountonbil=DiscountCalculator.getDiscountByDoller(totalcost);
					totaldiscount=discount+discountonbil;
				}else
					totaldiscount=discount;
				actualprice=totalcost-totaldiscount;
				
				return ResultMapper.mapFormToDomainForNormalProduct(userForm,totaldiscount,totalcost,productType,actualprice);
				
			}else if (totalcost>100) {
				int discountonbil=0;
				long actualprice=0;
				if(totalcost>=100){
					discountonbil=DiscountCalculator.getDiscountByDoller(totalcost);
				}
				actualprice=totalcost-discountonbil;
				
				return ResultMapper.mapFormToDomainForNormalProduct(userForm,discountonbil,totalcost,productType,actualprice);
				
				
			}else{
				return ResultMapper.mapFormToDomainForGroceries(userForm,0,totalcost,productType,totalcost);
			}
				
			
		}
		
	
	}

}
