package com.org.annotations.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
    public String hello(){
        return "hello Service";
    }
}
