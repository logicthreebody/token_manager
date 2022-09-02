package com.hu.token_manger;

import com.hu.token_manger.domin.Token;
import com.hu.token_manger.service.impl.TokenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestService2 {
    @Autowired
    TokenService tokenService;

    @Test
    void insert(){
        for (int i = 0; i < 10; i++) {
            Token token = new Token();
            token.setName("ServiceImpl"+i);
            token.setSymbol("ServiceImpl"+i);
            token.setTotal_supply(66666+i);

            tokenService.save(token);
        }
    }

    @Test
    void delete(){
        tokenService.removeById(32);
    }

}
