//3. Write a java program to find
// the largest number from the three numbers taken from the user.

package Operatorss;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number : ");
        int a = sc.nextInt();
        System.out.println("Second number : ");
        int b = sc.nextInt();
        System.out.println("Third number : ");
        int c = sc.nextInt();
        sc.close();


        if(a>b && a>c){
            System.out.println("Greatest Number is: "+ a);
        } else if (b>a && b>c) {
            System.out.println("Greatest Number is: "+ b);
        }else {
            System.out.println("Greatest Number is: " +c);
        }


    }
}
