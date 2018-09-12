package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;
import com.example.demo.enums.Commons;
import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.mapper.EmployeeMapper;
import com.skyline.common.entity.Department;

@RestController
public class DeptController {
	
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	
	@GetMapping("/dept/{id}")
	public Department getDepartment(@PathVariable("id") Integer id) {
		System.out.println(Commons.SUFCOINNAME.getType());
		return departmentMapper.selectByPrimaryKey(id);
	}
	
	@GetMapping("/dept")
	@Transactional
	public Department insertDept(Department department) {
		departmentMapper.insertDept(department);
		return department;
	}
 
	@GetMapping("/emp/{id}")
	public Employee getEmp(@PathVariable("id") Integer id) {
		return employeeMapper.getEmpById(id);
		
	}
}
