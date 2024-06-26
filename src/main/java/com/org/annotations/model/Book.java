package com.org.annotations.model;

public class Book {
    private int id;
    private String name;
    private int cost;

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
