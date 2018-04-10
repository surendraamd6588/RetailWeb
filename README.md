# RetailWeb
This Application created by using environment.
1. STS IDE
2. Mysql data base
3. Spring Boot framework
4. Spring data JPA.
For this application database name is 'store_details'. In this database i have created two table. 
'USERDETAILS' having fields:
USER_ID,USER_NAME,USER_TYPE,USER_CREATE_DATE,USER_UPDATE_DATE

'PRODUCTDETAILS' having fields:
PRODUCT_ID,PRODUCT_NAME,PRODUCT_TYPE,PRODUCT_COST

I have written two POST API to inset data in both table for testing.
http://localhost:8182/retail/saveuser
http://localhost:8182/retail/saveproduct

Now I have written one GET API for getDiscount on product this API take user ID as input 
URI=http://localhost:8182/retail/getdiscount/11(in this API 11 is user Id)
The accepted result like below

{
    "retailException": null,
    "statusCode": "OK",
    "message": "",
    "data": {
        "userId": 11,
        "userName": "Surendra",
        "totalCost": 200,
        "discount": 70,
        "productId": 9,
        "producttype": "Ele",
        "actualprice": 130,
        "userType": "Employee"
    }
}

