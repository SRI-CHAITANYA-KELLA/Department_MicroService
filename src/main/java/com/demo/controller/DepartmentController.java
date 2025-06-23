package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Department;
import com.demo.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/dept")
@Slf4j //It is a Lombok annotation that automatically provides a logger to your class, so you can write log messages without manually creating a logger.
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	/*@RequestBody : it is used to convert JSON object i.e., what we are giving in the postman in key,value pair*/
	@PostMapping("/insert")
	public Department saveDepartment(@RequestBody Department department) {
		log.info(" saveDepartment method of DepartmanrController");
		return service.saveDepartment(department);
	}
	
	@GetMapping("/getById/{id}")
	public Department findDeptById(@PathVariable("id") long deptId) {
		log.info(" findDepartmentById method of DepartmanrController");
		return service.findDeptById(deptId);
	}
	
	@PutMapping("/update/{deptId}/{deptName}")
	public Department updateDeptNamebyDeptId(@PathVariable String deptName , @PathVariable long deptId) {
		log.info(" UpdateDeptNameById method of DepartmanrController");
		return service.updateDeptNamebyDeptId(deptName , deptId);
	}
	
	@DeleteMapping("/delete/{deptId}")
	public ResponseEntity<String> deleteDeptByUsingDeptId(@PathVariable long deptId){
		log.info("deleteDeptByUsingDeptId method of DepartmanrController");
		service.deleteDept(deptId);
		return ResponseEntity.ok().body("Departmrnt closed");
	}
}
