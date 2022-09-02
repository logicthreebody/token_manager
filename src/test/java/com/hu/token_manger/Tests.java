package com.hu.token_manger;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hu.token_manger.dao.TokenDao;
import com.hu.token_manger.dao.TokenDao2;
import com.hu.token_manger.domin.Token;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Tests {
    @Autowired
    private TokenDao tokendao;

    @Autowired
    private TokenDao2 tokendao2;

    @Test
    void contextLoads() {
        System.out.println(tokendao.getId(1));
        System.out.println(tokendao.getId(2));
    }

    @Test
    void contextLoads2() {
        System.out.println("tokendao2====="+tokendao2);
        System.out.println(tokendao2.selectById(2));
        System.out.println(tokendao2.selectList(null));
    }

    @Test
    void insert(){
        for (int i = 0; i < 10; i++) {
            Token token = new Token();
            token.setName("token03"+i);
            token.setSymbol("TOKEN03"+i);
            token.setTotal_supply(66666+i);

            tokendao2.insert(token);
        }

    }

    @Test
    void update(){
        Token token = new Token();
        token.setId(3);
        token.setTotal_supply(77777);

        tokendao2.updateById(token);
    }
    @Test
    void query(){
        String name = "36";
        LambdaQueryWrapper<Token> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(name != null,Token::getName,name);

        tokendao2.selectList(wrapper);
    }
    @Test
    void delete(){
        tokendao2.deleteById(3);
    }
    @Test
    void testPage(){
        Page page = new Page(3,2);
        tokendao2.selectPage(page,null);

        System.out.println("page.getTotal()==="+page.getTotal());
        System.out.println("page.getPages()==="+page.getPages());
        System.out.println("page.getCurrent()="+page.getCurrent());
        System.out.println();
        System.out.println();
    }
}
