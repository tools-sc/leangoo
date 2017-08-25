package com.team6.leangoo.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by AgZou on 2017/8/24.
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
