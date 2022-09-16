package com.hu.token_manger;

import com.hu.token_manger.domin.Todo;
import com.hu.token_manger.service.impl.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class TestTodoService {
    @Autowired
    TodoService todoService;

    @Test
    void testAdd(){
        for (int i = 0; i < 6; i++) {
            Todo todo = new Todo();
            todo.setName("代办"+i);
            todo.setDescription("");
            todoService.save(todo);
        }
    }
    @Test
    void testRemoveById(){
        todoService.removeById(1);
    }
    @Test
    void testRemove(){
        ArrayList ids = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            ids.add(i);
        }
        todoService.removeByIds(ids);
    }
}
