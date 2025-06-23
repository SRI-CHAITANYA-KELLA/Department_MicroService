package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Department;

@Repository
public interface DepartmentReposiotry extends JpaRepository<Department, Long>{

	Department findByDeptId(long deptId);

}
