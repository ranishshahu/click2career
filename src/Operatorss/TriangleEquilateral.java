
//10.Write a java program to find if the triangle is equilateral or not.
//
package Operatorss;
import java.util.Scanner;
public class TriangleEquilateral {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of Triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of Triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side of Triangle: ");
        int c = sc.nextInt();

        if(a==b && b==c){
            System.out.println("--- It is Equilateral Triangle ---");
        }else {
            System.out.println("--- It is Not Equilateral Triangle ---");
        }

    }
}