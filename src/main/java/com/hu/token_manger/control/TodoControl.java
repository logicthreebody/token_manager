package com.hu.token_manger.control;

import com.hu.token_manger.control.view.DataResult;
import com.hu.token_manger.domin.Todo;
import com.hu.token_manger.service.impl.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "*",maxAge = 3600) //设置允许跨域访问
public class TodoControl {
    @Autowired
    TodoService todoService;

    @GetMapping
    DataResult getAllTodo(){
        return new DataResult(true,todoService.list());
    }

    @PostMapping
    DataResult addTodo(@RequestParam(value="todo_name") String name,@RequestParam String description){
//    DataResult addTodo(@RequestParam String name,@RequestParam String description){
        System.out.println("请求参数name:"+name);
        System.out.println("请求参数description:"+description);
        Todo todo = new Todo();
        todo.setName(name);
        todo.setDescription(description);
        return new DataResult(todoService.save(todo));
    }
}
