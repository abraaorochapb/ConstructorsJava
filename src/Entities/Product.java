package Entities;

public class Product {
    private String name;
    private double price;
    private int stock;

    // Sobrecarga = Criar mais de um construtor para uma classe
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters e Setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    public int addItem(int quantity){
        return stock += quantity;
    }

    public int removeItem(int quantity){
        return stock -= quantity;
    }

    public double totalValue(){
        return price * stock;
    }
}
