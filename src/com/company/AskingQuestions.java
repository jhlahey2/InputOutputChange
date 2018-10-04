package com.company;

import java.util.Scanner;

/**\
 * Assignment
 * Input/Output Change Assignment
 * This application takes 2 integer values and finds the largest one.
 * Change the application so that it finds the average of two double values.
 *
 */

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

//        int num1, num2, num3;
        double num1, num2;  //doubles are used so that two temps that are one degree apart can be averaged

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();  //casts int to double

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();  //casts int to double

//        System.out.println("The max value is : " + Math.max(num1, num2));
        System.out.println("The average value is " + ((num1 + num2) / 2));
    }
}