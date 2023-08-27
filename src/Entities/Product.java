package Entities;

public class Product {
    public String name;
    public double price;
    public int stock;

    // Sobrecarga = Criar mais de um construtor para uma classe
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
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
