package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.Department;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptMapper deptDao;
	@Override
	public List<Department> getAll() {
		//PageHelper.startPage(1, 1);
		return deptDao.selectAll();
	}

}
