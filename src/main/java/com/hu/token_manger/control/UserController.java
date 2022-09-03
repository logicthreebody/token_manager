package com.hu.token_manger.control;
import com.hu.token_manger.control.view.DataResult;
import com.hu.token_manger.domin.User;
import com.hu.token_manger.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public DataResult addUser(@RequestBody User user){
        user.setId(null);
        boolean flag = userService.save(user);
        return new DataResult(flag);
    }
    @DeleteMapping("{id}")
    public DataResult romve(@PathVariable int id){
        boolean flag = userService.removeById(id);
        return new DataResult(flag);
    }
    @PutMapping
    public DataResult update(@RequestBody User user){
        boolean flag = userService.updateById(user);
        return new DataResult(flag);
    }

    @GetMapping("{id}")
    public DataResult queryById(@PathVariable int id){
        return new DataResult(true,userService.getById(id));
    }
    @GetMapping("{currentPage}/{pageSize}")
    public DataResult queryPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return new DataResult(true,userService.pageQuery(currentPage,pageSize));
    }


}



































