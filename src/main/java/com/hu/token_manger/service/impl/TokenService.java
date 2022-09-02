package com.hu.token_manger.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hu.token_manger.dao.TokenDao2;
import com.hu.token_manger.domin.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class TokenService extends ServiceImpl<TokenDao2, Token>{
    @Autowired
    private TokenDao2 tokenDao2;

    public Page<Token> getPage(Integer currentPage,Integer pageSize){
        Page page = new Page(currentPage,pageSize);
        tokenDao2.selectPage(page,null);
        return page;
    }

}
