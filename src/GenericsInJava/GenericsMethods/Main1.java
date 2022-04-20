package GenericsInJava.GenericsMethods;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main1 {
    public static void main(String [] args){


        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};                       //Array of Integers.
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};   //Array of Strings.

        MapHelper1.addEntries(studentNamesMap,studentIds,studentNames);

        MapHelper1.printEntries(studentNamesMap);
        // The types of the K,V type parameters for the invocation to printEntries.K is of type Integer and
        // V is of type String.



        System.out.println("\n*************** Invoking same data types form DisplayElements Method.");

        MapHelper1.displayElements("Keys","Value");            // Both of type String
        MapHelper1.displayElements(new Date(), new Date());     // Both of type Date.
        MapHelper1.displayElements(204.56, 608.56);            // Both of type Double.

        System.out.println("\n*************** Invoking Different data types form DisplayElements Method.");

        MapHelper1.displayElements("ID",10);
        MapHelper1.displayElements(10001, new Date());
        MapHelper1.displayElements(1045.56, new UUID(123,567));


        System.out.println("\n*************** Invoking Different types for different elements in your input varargs.");

        MapHelper1.displayElement(100,200,300,400);
        MapHelper1.displayElement("Key","Value", new Date(), new UUID(543,678));
        MapHelper1.displayElement(new Date(), "Hello", 123.5);

        // The Type T can be Different types for different elements in your input varargs.
        // The Elements are stored in varargs type input arguments can be of different DATA Types.

    }
}


/*

 1- In order to populate my studentNamesMap with the studentIds and the studentNames mappings,I invoke MapHelper1.addEntries.
    Observe that i do not have to instantiate a MapHelper1 Object and specify the type values for the type parameters.

 2- So the generic type parameter T here is replaced with the actual type T.

 3- MapHelper1.displayElements("ID",10);  Takes two different parameters.So the type parameter T that we have specified for displayElements
    takes on two different values here in this method invocation.



* */