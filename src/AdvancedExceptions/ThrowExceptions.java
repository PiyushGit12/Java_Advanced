package AdvancedExceptions;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExceptions {

    public static void main(String [] args) throws IOException {

        System.out.println("Enter Your GPA to check Your Eligibility for Admission ");
         Scanner inputGpa = new Scanner(System.in);  //Created scanner object which is instantiated using System.in
         float gpa = inputGpa.nextFloat();

         inputGpa.close();

         if (gpa > 0 && gpa <= 4.33){

             System.out.println("That is Valid GPA. processing eligibility.....");
         }
         else {
             //         System.out.println("Sorry.. GPA must have a value between 0 and 4.33.");
             throw new IllegalArgumentException("Sorry.. GPA must have a value between 0 and 4.33.");
         }

    }
}
