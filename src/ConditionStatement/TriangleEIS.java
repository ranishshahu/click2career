
//WAP to take input on three sides of the triangle and check
// if the triangle is equilateral or isosceles or scalene.

// Equilateral = all sides are equal
// Isosceles = any two sides are equal
// Scalene = all sides are different

package ConditionStatement;

import java.util.Scanner;

public class TriangleEIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First side of Triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter Second side of Triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter Fhird side of Triangle: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("----It is Equilateral Triangle----");
        }else if(a==b || b==c || c==a){
            System.out.println("----It is  Isosceles Triangle----");
        }else {
            System.out.println("----It is Scalene Triangle----");
        }


    }
}
