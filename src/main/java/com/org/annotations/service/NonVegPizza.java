package com.org.annotations.service;

import org.springframework.stereotype.Component;


public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "NonVegPizza";
    }
}
