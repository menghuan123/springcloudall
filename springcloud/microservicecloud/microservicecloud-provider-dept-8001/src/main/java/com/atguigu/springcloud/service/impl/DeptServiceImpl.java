package com.atguigu.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.springcloud.dao.DeptDao;
import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.atguigu.springcloud.utils.RedisUtil;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;
	
	@Autowired
	private RedisUtil redisUtil;

	@Override
	public boolean add(Dept dept)
	{
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id)
	{


		Dept dept = dao.findById(id);
		String str = JSONObject.toJSONString(dept);
		redisUtil.set("data", str);
		String s = getObject("data");
		Dept dpets = JSONObject.parseObject(s, Dept.class);
		return dpets;


	}

	public String getObject(String str) {
		String object = (String)redisUtil.get(str);
		return object;
	}

	@Override
	public List<Dept> list()
	{
		return dao.findAll();
	}

}
