package com.org.annotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String hello(){
        return "hello Repo";
    }
}
