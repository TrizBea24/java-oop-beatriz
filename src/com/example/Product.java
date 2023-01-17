package com.example;

public class Product {
    //Atributos
    private String name;
    private String category;
    private String sales;
    private double price;
    private int id;
    private Manufacturer manufacturer;

    //Constructor
    public Product() {

    }

    public Product(String name, String category, String sales, float price, int id){
        this.name = name;
        this.category = category;
        this.sales = sales;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String Category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", sales='" + sales + '\'' +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
