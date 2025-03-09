package com.lab2;

public class StockItem {
    private String description;
    private int id;
    private static int nextId = 1;
    private double price;
    private int quantity;

    // Default constructor
    public StockItem(){
        this.id = generateUniqueId();
    }
    // Overloaded constructor
    public StockItem(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }
    // Getter Methods
    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    // Setter Methods
    public void setPrice(double newPrice) {
        price = newPrice;
        if (price < 0) {
            System.out.print("Error");
        }
    }
    public void lowerQuantity(int lowQuantity) {
        this.quantity -= lowQuantity;
        if (quantity < 0) {
            System.out.print("Error");
        }
    }
    public void raiseQuantity(int highQuantity) {
        this.quantity += highQuantity;
    }

    @Override
    public String toString () {
        return "Item number: " + (description.equals("1 Loaf of Bread") ? 1 : 0) + " is " + description + " has price " + price + " we currently have " + quantity + " in stock";
    }
    private static int generateUniqueId() {
        return nextId++;
    }
}
