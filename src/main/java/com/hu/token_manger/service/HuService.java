package com.hu.token_manger.service;

import com.hu.token_manger.dao.TokenDao2;
import com.hu.token_manger.domin.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HuService {
    @Autowired
    TokenDao2 tokenDao2;
    public boolean save(Token token){
        return tokenDao2.insert(token) > 0;
    }

    public boolean romve(int id){
        return tokenDao2.deleteById(id) > 0;
    }

}
