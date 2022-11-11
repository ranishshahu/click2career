

//8.Write a Java program that takes three numbers
// as input to calculate and print the average of the numbers


//average = sum of total no. / numbers of no.

package Operatorss;
import java.util.Scanner;
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Second Number: ");
        int num3 = sc.nextInt();


        double average = (num1 + num2 + num3)/3 ;   //sum of total no. / numbers of no.

        System.out.println("Average of given 3 number is: "+average );

    }
}
