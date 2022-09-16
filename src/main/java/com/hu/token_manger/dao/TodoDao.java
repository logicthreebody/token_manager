package com.hu.token_manger.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hu.token_manger.domin.Todo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoDao extends BaseMapper<Todo> {
}
