//2.Write a java program to take two number input from the user
// and display its sum,product,difference,quotient and remainder.
// Display invalid number as a message if any one of the numbers
// is less than or equals zero

package Operatorss;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First input: ");
        int a = sc.nextInt();

        System.out.println("Second input: ");
        int b = sc.nextInt();



        if(a==0 || a<=0 || b==0 || b<=0 ){
            System.out.println("Invalid input given:  "+a);
            System.out.println("Invalid input given:  "+b);
        }
        else{

            int sum = a+b;
            int diff = a-b;
            int mul = a*b;
            int div = a/b;  //quotient
            int mod = a%b; //remainder


            System.out.println("sum is: "+a + "+" + b +"=" + sum);
            System.out.println("diff is: "+a + "-" + b +"=" +diff);
            System.out.println("product is: "+a + "*" + b +"=" +mul);
            System.out.println("quotient is: "+a + "/" + b + "=" + div);
            System.out.println("reminder is: "+a + "%" + b + "=" + mod);
        }










    }
}
