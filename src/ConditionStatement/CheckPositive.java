//WAP to check if a number is positive or not.
package ConditionStatement;
import java.util.Scanner;

public class CheckPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = sc.nextInt();

        if(a<=0){
            System.out.println("Number is Negative :"+a);
        }
        else {
            System.out.println("Number is Positive: "+a);
        }

    }
}
