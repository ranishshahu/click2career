

//Write a Java program to print
// the area and perimeter of a rectangle.



//Area of rectangle = Length * Breadth
//Perimeter 0f rectangle = 2 *(L+B)

package Operatorss;
import java.util.Scanner;
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the Length: ");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth");
        int breadth = sc.nextInt();


        int area = length * breadth;

        int perimeter =2*(length+breadth);

        System.out.println("The Area of Rectangle is: "+ area);
        System.out.println("The Perimeter of Rectangle is: "+ perimeter);


    }
}
