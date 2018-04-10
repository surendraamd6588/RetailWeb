package com.sure.web.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sure.web.enitity.UserDetails;
import com.sure.web.form.ResultForm;
import com.sure.web.form.UserDetailsForm;

public class ResultMapper {
	
	/**
	 * This method is used to convert UserDetails Domain into Result Form.
	 * 
	 
	 */
	public static ResultForm mapDomainToForm(UserDetails resultForm) {
		ResultForm userDetails = new ResultForm();

		


		return userDetails;
	}
	

	/**
	 * This method is used to convert TCG Domain into TCG Form.
	 * 
	 * @param TcgHeatPlan
	 * @return TcgHeatPlanForm
	 */
	public static ResultForm mapFormToDomain(UserDetails userDetails,long totalCost,int discount) {
		ResultForm resultForm = new ResultForm();

			
		
		return resultForm;
	}
	
	public static List<ResultForm> mapDomainListToFormList(List<UserDetails> userDetails,long totalCost,int discount) {
 	   List<ResultForm> resultForm = new ArrayList<ResultForm>();
 	   for (UserDetails UserDetailsdata : userDetails) {
 		  resultForm.add(mapDomainToForm(UserDetailsdata));
 	   }
 	   return resultForm;

    }
	public static ResultForm mapFormToDomainForGroceries(UserDetailsForm userDetailsForm, int discount,
			long totalcost,String productType,long actualprice) {
		ResultForm resultForm=new ResultForm();
		resultForm.setProductId(userDetailsForm.getProductId());
		resultForm.setUserId(userDetailsForm.getUserId());
		resultForm.setUserName(userDetailsForm.getUserName());
		resultForm.setUserType(userDetailsForm.getUserType());
		resultForm.setTotalCost(totalcost);
		resultForm.setDiscount(discount);
		resultForm.setProducttype(productType);
		resultForm.setActualprice(actualprice);
		return resultForm;
	}
	
	public static ResultForm mapFormToDomainForNormalProduct(UserDetailsForm userDetailsForm, int discount,
			long totalcost,String productType,long actualPrice) {
		ResultForm resultForm=new ResultForm();
		resultForm.setProductId(userDetailsForm.getProductId());
		resultForm.setUserId(userDetailsForm.getUserId());
		resultForm.setUserName(userDetailsForm.getUserName());
		resultForm.setUserType(userDetailsForm.getUserType());
		resultForm.setTotalCost(totalcost);
		resultForm.setDiscount(discount);
		resultForm.setProducttype(productType);
		resultForm.setActualprice(actualPrice);
		return resultForm;
	}



}
