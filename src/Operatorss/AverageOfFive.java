
//9.Write a java program to find the average of 5 numbers.
package Operatorss;

import java.util.Scanner;
public class AverageOfFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = sc.nextInt();
        System.out.println("Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Third number: ");
        int num3 = sc.nextInt();
        System.out.println("Fourth number: ");
        int num4 = sc.nextInt();
        System.out.println("Fifth number: ");
        int num5 = sc.nextInt();

        double average = (num1+num2+num3+num4+num5)/5;  //sum of total no. / numbers of no.

        System.out.println("The Average of Given 5 no. is : "+average);

    }
}
