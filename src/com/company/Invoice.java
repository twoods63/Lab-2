package com.company;
// Example from class
public class Invoice {
    private int customerId;
    private static int nexCustomerId;
    private String customerName;
    private String date;
    private float cost;
    // Customer Name method
    public String getcost() {
        return customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setcost(int newcost) {
        customerId = newcost;
    }
    public void setDate(String newdate) {
        date = newdate;
    }
    public String getDate() {
        return date;
    }
    public void setCustomerId(int newcustomerId) {
        customerId = newcustomerId;
    }
    public int getCustomerId() {
        return customerId;
    }

    // Overloaded method
    public Invoice(String newdate, float newcost, String customerName) {
        date = newdate;
        cost = newcost;
        customerId = nexCustomerId;
        nexCustomerId++;
    }
    // Default constructor
    public Invoice() {
       date = "17 Jan, 2023";
       cost = 0.0f;
       customerName = "Bob";
       customerId = nexCustomerId;
       nexCustomerId++;
    }

    @Override
    public String toString() {
        return "customerName is:" + customerName + "costs: "+ cost + "date: " + date + customerId;
    }
}
