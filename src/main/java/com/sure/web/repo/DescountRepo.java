package com.sure.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sure.web.enitity.UserDetails;

public interface DescountRepo extends JpaRepository<UserDetails, Long>{

}
