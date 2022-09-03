package com.hu.token_manger;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hu.token_manger.dao.UserDao;
import com.hu.token_manger.domin.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestUser {
    @Autowired
    public UserDao userDao;

    @Test
    void add(){
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("test"+i);
            user.setAge(22+i);
            user.setDescription("是个人才"+i);
            userDao.insert(user);
        }
    }
    @Test
    void remove(){
        userDao.deleteById(6);
    }

    @Test
    void update(){
        User user = new User();
        user.setId(10);
//        user.setName("xxxxxxxx");
        user.setAge(29);
        user.setDescription("呃呃呃");
        user.setAddress("新的地址");
        userDao.updateById(user);
    }
    @Test
    void queryPage(){
        Page page = new Page(2,3);

        System.out.println( userDao.selectPage(page,null));
    }
}
