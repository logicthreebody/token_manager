package com.hu.token_manger.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hu.token_manger.dao.TodoDao;
import com.hu.token_manger.domin.Todo;
import org.springframework.stereotype.Service;

@Service
public class TodoService extends ServiceImpl<TodoDao,Todo> {
}