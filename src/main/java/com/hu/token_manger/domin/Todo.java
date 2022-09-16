package com.hu.token_manger.domin;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class Todo {
    private Integer id;
    private String name;
    private String description;
}
