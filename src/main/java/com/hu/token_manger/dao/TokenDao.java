package com.hu.token_manger.dao;

import com.hu.token_manger.domin.Token;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TokenDao {
    @Select("select * from t_token where id=#{id}")
    public Token getId(int id);
}
