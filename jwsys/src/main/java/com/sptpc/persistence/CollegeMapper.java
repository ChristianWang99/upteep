package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.College;

@Repository
public interface CollegeMapper {
	//找到所以院系
	public List<College> findAllCollege();
	
	
}
