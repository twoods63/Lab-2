package com.lab2;

import java.util.*;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StockItem milk = new StockItem("1 Gallon of Milk", 3.60, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);

        int choice;
        do {
            System.out.print("\n1. Sold One Milk\n2. Sold One Bread\n3. Change price of Milk\n4. Change price of Bread\n5. Add Milk to Inventory\n6. Add Bread to Inventory\n7. See Inventory\n8. Quit\n");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    milk.lowerQuantity(1);
                break;
                case 2:
                    bread.lowerQuantity(1);
                break;
                case 3:
                    System.out.println("What is the new price for Milk");
                    double newMilkPrice = sc.nextDouble();
                    milk.setPrice(newMilkPrice);
                break;
                case 4:
                    System.out.println("What is the new price for Bread");
                    double newBreadPrice = sc.nextDouble();
                    bread.setPrice(newBreadPrice);
                break;
                case 5:
                    System.out.println("How many milk did we get?");
                    int addMilkQuantity = sc.nextInt();
                    milk.raiseQuantity(addMilkQuantity);
                break;
                case 6:
                    System.out.println("How many bread did we get?");
                    int addBreadQuantity = sc.nextInt();
                    bread.raiseQuantity(addBreadQuantity);
                break;
                case 7:
                    System.out.println("\nMilk: " + milk);
                    System.out.println("Bread: " + bread);
                break;
                case 8:
                    break;
                default: System.out.println("Invalid choice. Select a valid choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}
