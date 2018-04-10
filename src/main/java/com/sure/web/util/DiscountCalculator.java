package com.sure.web.util;

public class DiscountCalculator {
	
	public static int getDiscountBypercentage(long price, String userType){
		int discount=0;
		if(userType.equalsIgnoreCase("employee"))
			discount=(int) ((price*30)/100);
		else if (userType.equalsIgnoreCase("enduser")) {
			discount=(int) ((price*10)/100);
			
			}else
				discount=(int) ((price*5)/100);
				
		return discount;
		
	}
	
	public static int getDiscountByDoller(long totalcost){
		
		int noOfDiscount=(int) (totalcost/100);
		int discountonbil=noOfDiscount*5;
		return discountonbil;
		
	}

}
