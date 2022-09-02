package com.hu.token_manger.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.hu.token_manger.domin.Token;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TokenDao2 extends BaseMapper<Token> {

    @Select("")
    public Token getT();

}
