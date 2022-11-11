//7. Write a Java program to print
// the area and perimeter of a square.

//Area of a square = side*side=side^2
//perimeter of a square = 4*side
package Operatorss;
import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side = sc.nextDouble();



        double area = side * side;
        double perimeter = 4*side;

        System.out.println("Area of square is: "+area);
        System.out.println("Perimeter Of Square is: "+ perimeter);

    }
}
