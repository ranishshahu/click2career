

//1. Write a program to take name input from the user and display Hello + name as output.

package Operatorss;
import java.util.Scanner;
public class HelloName {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


        System.out.println("First name: ");
        String fname =sc.nextLine();

        System.out.println("Last name: ");
        String lname =sc.nextLine();


        System.out.println("Hello "+fname + " "+lname);



    }
}
