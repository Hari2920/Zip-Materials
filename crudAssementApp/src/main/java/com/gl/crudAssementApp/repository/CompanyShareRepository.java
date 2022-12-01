package com.gl.crudAssementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.crudAssementApp.bean.CompanyShare;

public interface CompanyShareRepository extends JpaRepository<CompanyShare, Long> {
	@Query("select max(CompanyId) from CompanyShare")
	public Long findMaxCompanyID();
	
	
	

}
