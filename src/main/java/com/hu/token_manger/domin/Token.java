package com.hu.token_manger.domin;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class Token {
    Integer id;
    String contract_address;
    String name;
    String symbol;
    int total_supply;
    int decimals;


}
