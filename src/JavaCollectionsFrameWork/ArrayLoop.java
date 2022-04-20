package JavaCollectionsFrameWork;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String [] args){


        String[] companies = {"Amazon","Google", "Flipkart", "Microsoft"};    // We can also initialize array like this.

        System.out.println("Specifying index Manually values to an array");

        for(int i=0; i < 4; i++)
        {
            System.out.format("Companies[%d]: %s ", i, companies[i]);
            System.out.println();
        }
        // Might be a chance of getting a ArrayIndexOutOfBoundExceptions when we manually provide a index values.

        System.out.println("\n******** Use Array length instead of Specifying index Manually ");

        for(int i=0; i < companies.length; i++)
        {
            System.out.format("Companies[%d]: %s ", i, companies[i]);
            System.out.println();
        }

        System.out.println("\n*****   Even better, use a for-each loop to iterate over Arrays");

        for(String company: companies)
        {
            System.out.format("Company %s ", company);
            System.out.println();
        }
        /*  I have a for loop String company: Companies.This will ensure that every element in the companies array is assigned to the
        * Company variable.One element for each iteration of this for-each Loop.    */



        Object[] mixedArray = {"Amazon", 100.0f,23,true};

        System.out.println("\n********** Holding  elements of different data types");
        System.out.println(" Object[]  Mixed Array type contents: " + Arrays.toString(mixedArray));


        for(Object element: mixedArray){
            System.out.format("Element Class: %s ", element.getClass());
            System.out.println();

            System.out.format("Element %s ", element);
            System.out.println();
        }
/* Using this array is hard bcz the only way to access the individual elements of the array is to access it as type Object,as we do in this line
*   for(Object element: mixedArray). When we access the elements of this array, we have to specify every element to be a type of object bcz we do
*   not know the type of the object.But at runtime ,every object knows its type. */


    }
}


/* 1-  Now,If you don't need the actual index positions for each element in the array,however,you do need to iterate over all of the Elements
*   in the array,the best kind of FOR Loop to use is the FOR-EACH Loop.
*
* 2-  Now the FOR-EACH loop is not a good choice when you need to know exactly what index position each element is at.
*      But if all you want is access to all of the elements of the array,Simple use the FOR_EACH Loop and don't worry about indexes at all.
*     There is no chance of an IndexOutOfBoundException.
*
* 3-  Arrays all containing the same type of Elements.If you want an array to hold elements of different data types,you need to declare
*     that array to be a type of Object.
*4-  Object arrays are very rarely used in production code bcz they tend to be very problematic and  cause lots of errors.
*
*
*      */