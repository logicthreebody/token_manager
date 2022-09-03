package com.hu.token_manger.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hu.token_manger.dao.UserDao;
import com.hu.token_manger.domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserDao, User> {

    @Autowired
    private UserDao userdao;

    public Page<User> pageQuery(int currentPage, int pageSize){
        Page<User> page = new Page(currentPage,pageSize);
        userdao.selectPage(page,null);
        return page;
    }
}
