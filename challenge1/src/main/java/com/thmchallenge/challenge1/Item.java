package com.thmchallenge.challenge1;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class Item {
    private String id;
    private String category;
    private String name;
    private double price;
    private double discount;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;


    public Item(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id =  id;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
