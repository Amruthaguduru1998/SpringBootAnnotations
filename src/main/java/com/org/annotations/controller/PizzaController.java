package com.org.annotations.controller;

import com.org.annotations.service.Pizza;
import com.org.annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    //filed injection
    private Pizza pizza;

    //constructor Injection
//    public PizzaController(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    //setterInjection
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }

    public String getPizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("intilisation logic");
    }

    public void destroy(){
        System.out.println("destroy logic");
    }
}
