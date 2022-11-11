//WAP to check if a person is eligible
// to cast a vote or not. PS.
// Make your own age bar for eligibility.


package ConditionStatement;
import java.util.Scanner;
public class EligibleToCastVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Voter First Name: ");
        String fname = sc.nextLine();
        System.out.println("Voter Last Name: ");
        String lname = sc.nextLine();

        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age>18){
            System.out.println(fname+lname+" Your age  is "+age+ "You are eligible to cast a vote: ");
        }else {
            System.out.println(fname+lname+" Your age  is "+age+ " so you are not eligible to cast a vote: ");
        }



    }
}
