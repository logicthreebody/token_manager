package com.hu.token_manger.domin;

import lombok.Data;

@Data
public class Token {
    int id;
    String contract_address;
    String name;
    String symbol;
    int total_supply;
    int decimals;


}
