
//Write a program to take a character input from a keyboard and print whether it is vowel or consonant.
// vowel= a,e,i,o,u
package ConditionStatement;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character: ");

        char ch;
        ch = sc.next().charAt(0);

        if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u'){
            System.out.println("Entered Character is Vowel: "+ch);
        }else {
            System.out.println("Entered Character is Consonant: "+ch);

        }



    }
}
