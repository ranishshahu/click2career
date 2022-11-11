//6.Write a Java program to print
// the area and perimeter of a circle.



//Area of circle = piR^2
//Perimeter 0f circle = 2piR

package Operatorss;
import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of radius: ");
        double r = sc.nextDouble();

        sc.close();

        double area = 3.14 * r * r;  //value of pi is always 3.14
        double perimeter = 2*3.14*r;


        System.out.println("The Area of Circle is: "+ area);
        System.out.println("The Perimeter of Circle is: "+ perimeter);


    }
}
