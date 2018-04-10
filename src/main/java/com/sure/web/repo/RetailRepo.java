package com.sure.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sure.web.enitity.UserDetails;

public interface RetailRepo extends JpaRepository<UserDetails, Long>{
	
	@Query("select u from UserDetails u where u.userId=?1")
	public UserDetails findUserById(@Param("userId") long userId);

}
