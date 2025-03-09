package com.company;

public class Main {
    public static void main(String[] args) {
        Invoice myInvoice = new Invoice();
        Invoice myOtherInvoice = new Invoice("17 Jan, 2023", 12.25f, "Alekhya");
        System.out.println(myOtherInvoice);
        System.out.println(myInvoice);
    }
}