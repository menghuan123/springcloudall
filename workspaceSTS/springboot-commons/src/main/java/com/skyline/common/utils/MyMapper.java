package com.skyline.common.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 通用mapper接口
 * @author ex-caowu
 *
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
	
}
