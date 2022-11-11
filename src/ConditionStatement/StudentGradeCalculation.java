//WAP to take marks in 5 subjects of the student ,
// The marks must not be less than 0 and also must not be greater than 100.
// Calculate the total scored by the student and find his/her grade.
// PS: make your own grading criteria.

//
//   Marks	Grade
//        Marks>= 90	A - Excellent
//        90>Marks>=80	B - Very Good
//        80>Marks>=70	C - Good
//        70>Marks>=60	D - Satisfactory
//        60>Marks>=50	E - Work Hard
//        50>Marks>=40	F - Just Passed
//        Marks<40	Failed

package ConditionStatement;
import java.util.Scanner;
import java.util.SortedMap;

public class StudentGradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Marks in English: ");
        double a = sc.nextDouble();
        if (a>100 ) {
            System.out.println("Entered no."+a+" is more than 100: ");

        } else if (0>a) {
            System.out.println("Entered no."+a+" is less than 0: ");
        }


        System.out.println("Marks in Nepali: ");
        double b = sc.nextDouble();
        if (b>100 ) {
            System.out.println("Entered no."+b+" is more than 100: ");

        } else if (0>b) {
            System.out.println("Entered no."+b+" is less than 0: ");
        }



        System.out.println("Marks in Computer: ");
        double c = sc.nextDouble();
        if (c>100 ) {
            System.out.println("Entered no."+c+" is more than 100: ");

        } else if (0>c) {
            System.out.println("Entered no."+c+" is less than 0: ");
        }


        System.out.println("Marks in Social: ");
        double d = sc.nextDouble();
        if (d>100 ) {
            System.out.println("Entered no."+d+" is more than 100: ");

        } else if (0>d) {
            System.out.println("Entered no."+d+" is less than 0: ");
        }


        System.out.println("Marks in Maths: ");
        double e = sc.nextDouble();
        if (e>100 ) {
            System.out.println("Entered no."+e+" is more than 100: ");

        } else if (0>e) {
            System.out.println("Entered no."+e+" is less than 0: ");
        }


        sc.close();


        double total = a+b+c+d+e;
        double average = (total)/5;

        System.out.println("The Total Marks is: "+total);
        System.out.println("The average is : "+average+"%");

        if (average<40) {
            System.out.println("You are Failed in Exam");
        } else if (50>average) {
            System.out.println("Just Pass Your Grade is F ");
        } else if (60>average) {
            System.out.println("Work Hard Your Grade is E");
        } else if (70>average) {
            System.out.println("Satisfactory Your Grade is D");
        } else if (80>average) {
            System.out.println("Good Your Grade is C");
        } else if (90>average) {
            System.out.println("Very Good Your Grade is B");
        }else if(100>average){
            System.out.println("Excellent Your Grade is A");
        } else if (average>100) {
            System.out.println("You have entered Invalid Marks in your subject above: Please Recheck Your marks ");
        }

//        if (a>0 && a<100 && b>0 && b<100  ) {
//            System.out.println("Marks eng "+a);
//            System.out.println("Marks nep "+b);
//        }else {
//            System.out.println("Invalid Number");
//        }

    }
}
