package com.hu.token_manger;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hu.token_manger.dao.TokenDao;
import com.hu.token_manger.dao.TokenDao2;
import com.hu.token_manger.domin.Token;
import com.hu.token_manger.service.HuService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestService {
    @Autowired
    HuService service;

    @Test
    void insert(){
        for (int i = 0; i < 10; i++) {
            Token token = new Token();
            token.setName("servic03"+i);
            token.setSymbol("Servic03"+i);
            token.setTotal_supply(66666+i);

            service.save(token);
        }
    }

    @Test
    void delete(){
        service.romve(20);
    }

}
