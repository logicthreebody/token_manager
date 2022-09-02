package com.hu.token_manger.control.view;

import lombok.Data;

@Data
public class DataResult {
    private boolean flag;
    private Object data;

    public DataResult(){}

    public DataResult(boolean flag){
        this.flag = flag;
    }
    public DataResult(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }


}
