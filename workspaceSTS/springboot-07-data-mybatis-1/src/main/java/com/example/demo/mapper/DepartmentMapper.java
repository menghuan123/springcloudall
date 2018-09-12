package com.example.demo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.skyline.common.entity.Department;
import com.skyline.common.utils.MyMapper;

//@Mapper
public interface DepartmentMapper extends MyMapper<Department>{
	
	@Select("select * from department where id = #{id}")
	public Department getDeptById(Integer id);
	
	@Delete("delete from department where id = #{id}")
	public int deleteDeptById(Integer id);
	
	@Options(useGeneratedKeys=true,keyProperty="id")//插入操作时,注入数据库中的对应的自增长id的数值
	@Insert("insert into department(department_name) values(#{departmentName})")
	public int insertDept(Department department);
	
	@Update("update department set department_name = #{departmentName}")
	public int updateDept(Department department);

}
