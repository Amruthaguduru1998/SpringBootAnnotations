package com.org.annotations.controller;

import com.org.annotations.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/hello")
    //@ResponseBody
    public String helloWorld(){
        return "helloworld";
    }

    @RequestMapping("/book")
    //@ResponseBody
    public Book getBook(){
        Book book=new Book(1,"java",200);
        return book;
    }
}
