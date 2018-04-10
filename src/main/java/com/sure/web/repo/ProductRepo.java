package com.sure.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sure.web.enitity.ProductDetails;

public interface ProductRepo extends JpaRepository<ProductDetails, Long> {
	
	@Query("select p from ProductDetails p where p.productId=?1 ")
	public ProductDetails findProductById(@Param("productId") long productId);

}
