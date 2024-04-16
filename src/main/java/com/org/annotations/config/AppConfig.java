package com.org.annotations.config;

import com.org.annotations.controller.PizzaController;
import com.org.annotations.service.NonVegPizza;
import com.org.annotations.service.Pizza;
import com.org.annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(nonVegPizza());
    }
}
