//Write a java program to accept two
// integers and check whether they are equal or not.

package ConditionStatement;
import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Integer no.: ");
        int a = sc.nextInt();
        System.out.println("Enter Second Integer no.: ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("The Number is Equal");
        }else {
            System.out.println("The Number is not Equal");
        }
    }
}
