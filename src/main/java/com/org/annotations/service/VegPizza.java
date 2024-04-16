package com.org.annotations.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class VegPizza implements Pizza {

    @Override
    public String  getPizza(){
        return "VegPizza";
    }

}
