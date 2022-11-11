
//WAP to take two input coordinates x and y from
// the user and find in which quadrant does the coordinate lie.
//+x +y  Q1
//-x  +y  Q2
//-x   -y  Q3
//+x  -y  Q4
package ConditionStatement;

import java.util.Scanner;
public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("This lies in Q1 ");
        } else if (x<0 && y>0) {
            System.out.println("This lies in Q2");
        } else if (x<0 && y<0) {
            System.out.println("This lies in Q3");
        }else if (x>0 && y<0){
            System.out.println("This lies in Q4");
        }


    }
}
