

//4. Write a java program to  check if the number is even or odd.
package Operatorss;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter any number: ");
        int a = sc.nextInt();
        sc.close();

        int remainder = a % 2; //number should be divisible by 2 else odd


        if(remainder == 0){
            System.out.println("The given no. is Even: "+a);
        }else {
            System.out.println("The given no. is Odd: "+a);
        }

    }
}
