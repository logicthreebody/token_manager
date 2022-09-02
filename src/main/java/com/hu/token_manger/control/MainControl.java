package com.hu.token_manger.control;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hu.token_manger.control.view.DataResult;
import com.hu.token_manger.domin.Token;
import com.hu.token_manger.service.impl.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tokens")
public class MainControl {
    @Autowired
    private TokenService tokenService;


    @PostMapping
    public DataResult save(@RequestBody Token token){
        return new DataResult(tokenService.save(token));
    }

    @DeleteMapping("{id}")
    public DataResult remove(@PathVariable Integer id){
        return new DataResult(tokenService.removeById(id));
    }

    @PutMapping
    public DataResult update(@RequestBody Token token){
        return new DataResult(tokenService.updateById(token));
    }

    @GetMapping("{id}")
    public DataResult getToken(@PathVariable Integer id){
        return new DataResult(true,tokenService.getById(id));
    }

    @GetMapping
    public DataResult getTokens(){
        return new DataResult(true,tokenService.list());
    }
    //分页查询
    @GetMapping("{current}/{pageSize}")
    public DataResult getPages(@PathVariable Integer current, @PathVariable Integer pageSize){
        return new DataResult(true,tokenService.getPage(current,pageSize));
    }

}
