
//Write a program for the restaurant console application.
// At first, an application prints the menu for the items along with their prices and allows
// the customer to choose from the list by taking input from the keyboard. Based on the customer’s inputs, print the chosen items and total price.
//For example: Let's say following is the list of items
//Mo:Mo Chicken	150
//Mo:Mo Buff		120
//Mo:Mo Veg		100
//Burger Chicken	150

package ConditionStatement;

import java.util.Scanner;

public class Resturant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Resturant Menu---");
        System.out.println("1. Veg.Momo Rs.80");
        System.out.println("2. Buff.Momo Rs.100");
        System.out.println("3. Veg.Chowmin Rs.80");
        System.out.println("4. Burger Rs.150");
        System.out.println("5. Cheese.Pizza Rs.200");
        System.out.println("6. Exit");
        int choice;


        do {
            System.out.print("Choose Menu No. Here: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Veg.Momo Rs.80");
                    break;
                case 2:
                    System.out.println("2. Buff.Momo Rs.100");
                    break;
                case 3:
                    System.out.println("3. Veg.Chowmin Rs.80");
                    break;
                case 4:
                    System.out.println("4. Burger Rs.150");
                    break;
                case 5:
                    System.out.println("5. Cheese.Pizza Rs.200");
                    break;
                case 6:
                    System.out.println("---Invalid Choice---");
                    break;
            }

        }while (choice!=6);

    }
}
