package com.sure.web.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sure.web.enitity.ProductDetails;
import com.sure.web.enitity.UserDetails;
import com.sure.web.form.ProductDetailsForm;
import com.sure.web.form.UserDetailsForm;


public class ProductMapper {
	
public static ProductDetails mapDomainToForm(ProductDetailsForm productDetailsForm) {
		ProductDetails userDetailsdata = new ProductDetails();
		userDetailsdata.setProductId(productDetailsForm.getProductId());
		userDetailsdata.setProductName(productDetailsForm.getProductName());
		userDetailsdata.setProductType(productDetailsForm.getProductType());
		userDetailsdata.setProductCost(productDetailsForm.getProductCost());	
		return userDetailsdata;
	}
	
	public static ProductDetailsForm mapFormToDomain(ProductDetails productDetails) {
		
		ProductDetailsForm productDetailsForm = new ProductDetailsForm();
		productDetailsForm.setProductId(productDetails.getProductId());
		productDetailsForm.setProductName(productDetails.getProductName());
		productDetailsForm.setProductType(productDetails.getProductType());
		productDetailsForm.setProductCost(productDetails.getProductCost());
		
		return productDetailsForm;
	
	}
	
		
	/*public static List<ProductDetailsForm> mapDomainListToFormList(List<ProductDetails> userDetails) {
	 	   List<UserDetailsForm> resultForm = new ArrayList<UserDetailsForm>();
	 	   for (ProductDetails UserDetailsdata : userDetails) {
	 		  resultForm.add(mapFormToDomain(UserDetailsdata));
	 	   }
	 	   return resultForm;

	    }*/


}
