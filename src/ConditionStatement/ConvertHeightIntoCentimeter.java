
//WAP to take the person’s height in feet and
// convert it into centimeters and display it.

// 1feet = 30.48cm
package ConditionStatement;
import java.util.Scanner;
public class ConvertHeightIntoCentimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Height in Feet: ");
        double feet = sc.nextDouble();

        double cm = feet * 30.48; //1ft=30.48cm

        System.out.println("Your height in Centimeter is: " +cm);


    }

}
