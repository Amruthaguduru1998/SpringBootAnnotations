package com.org.annotations.controller;

import com.org.annotations.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    @RequestMapping("/hello")
    //@ResponseBody
    public String helloWorld(){
        return "helloworld";
    }

   // @RequestMapping(value = {"/book","/core","/ammu"},method = RequestMethod.GET)
    @GetMapping(value = {"/book","/core","/ammu"})
    //@ResponseBody
    public Book getBook(){
        Book book=new Book(1,"java",200);
        return book;
    }

    @PostMapping(value = "/add",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        System.out.println(book.getId());
        System.out.println(book.getName());
        System.out.println(book.getCost());
        return new ResponseEntity<>(book,HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Book> updateBook(@PathVariable int id ,@RequestBody Book ubook){
        System.out.println(id);
        System.out.println(ubook.getName());
        System.out.println(ubook.getCost());
        ubook.setId(id);
        return ResponseEntity.ok(ubook);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id){
        System.out.println(id);
        return ResponseEntity.ok("book delete success");
    }

    @GetMapping("/getb/{id}/{name}/{cost}")
    public ResponseEntity<Book> getbook(@PathVariable int id,@PathVariable String name,@PathVariable int cost){
        System.out.println(id);
        Book book=new Book();
        book.setId(id);
        book.setName(name);
        book.setCost(cost);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/query")
    public ResponseEntity<Book> requestParamDemo(@RequestParam(name = "id") int id,@RequestParam(name = "cost") int cost,@RequestParam(value = "name") String name){
        System.out.println(id);
        System.out.println(cost);
        System.out.println(name);
        Book book =new Book();
        book.setId(id);
        book.setCost(cost);
        book.setName(name);
        return ResponseEntity.ok(book);
    }
}
