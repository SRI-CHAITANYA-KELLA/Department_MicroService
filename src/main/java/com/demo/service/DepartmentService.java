package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Department;
import com.demo.repository.DepartmentReposiotry;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired
	private DepartmentReposiotry repo;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment of DepartmentService");
		return repo.save(department);
	}

	public Department findDeptById(long deptId) {
		log.info("Inside findDeptById of DepartmentService");
		return repo.findByDeptId(deptId);
	}

	public Department updateDeptNamebyDeptId(String deptName, long deptId) {
		log.info("Inside updateDeptNamebyDeptId of DepartmentService");
		Department department = repo.findByDeptId(deptId);
		if(department == null) {
			 throw new RuntimeException("Department id is not available"+deptId);
		}
		department.setDeptName(deptName);
		return repo.save(department);
	}

	public void deleteDept(long deptId) {
		repo.deleteById(deptId);
		
	}
	
}
