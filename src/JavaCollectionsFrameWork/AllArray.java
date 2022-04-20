package JavaCollectionsFrameWork;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class AllArray {
    public static void main(String [] args){

        int [] intArray =  new int[4];

        intArray[0] = 10;
        intArray[1] = 20;

        float [] floatArray = new float[6];

        floatArray[1] = 10.5f;
        floatArray[5] = 20.5f;

        String [] stringArray = new String[7];

        stringArray[1] = "Good";
        stringArray[2] = "Morning";

        Date[] dateArray = new Date[10];
        
        dateArray[1] = Calendar.getInstance().getTime();
        dateArray[2] = Calendar.getInstance().getTime();

        System.out.println("intArray instanceOf  Object: " + (intArray instanceof Object));
        System.out.println("floatArray instanceOf  Object: " + (floatArray instanceof Object));
        System.out.println("stringArray instanceOf  Object: " + (stringArray instanceof Object));
        System.out.println("dateArray instanceOf  Object: " + (dateArray instanceof Object));

        /* All of these arrays,whether they are arrays of primitive types or object,are basically objects.    */


        System.out.println("\ntoString() Representation: " + Arrays.toString(intArray));
        System.out.println("intArrays.length: " +intArray.length);


        System.out.println("\ntoString() Representation: " +Arrays.toString(floatArray));
        System.out.println("floatArray.length: " +floatArray.length);


        System.out.println("\ntoString() Representation: " +Arrays.toString(stringArray));
        System.out.println("stringArray.length: " +stringArray.length);


        System.out.println("\ntoString() Representation: " +Arrays.toString(dateArray));
        System.out.println("dateArray.length: " +dateArray.length);


        String[] companies = {};                 // This is how you can specify a Zero-Length array.
        String[] otherCompanies = new String[0];  // Another way of specify a Zero-Length array.

        System.out.println("\nCompanies.Length: " + companies.length);
        System.out.println("OtherCompanies.Length: " + otherCompanies.length);

  //      companies[0] = "skillSoft";    // Got an ArrayIndexOutOfBoundExceptions  error.
        //    otherCompanies[0] = "Skill";    //Got an ArrayIndexOutOfBoundExceptions  error .



    }
}

/*  1- In java its entirely possible to specify a Zero-length array,an array that can hold no Elements.kind of useless but it's possible.
       Once you have Zero-length array,it means you cannot assign any elements to be a part of these arrays.
*   2- Any negative value or -1 is not a valid index look up in a java array.

*
* */