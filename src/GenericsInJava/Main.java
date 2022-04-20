package GenericsInJava;

import java.util.Calendar;

public class Main {
    public static void main(String [] args){

        System.out.println("****** A single repository holding different data types Object.");

        Repository fifteen = new Repository(15);
        System.out.println(fifteen);

        Repository tenPointOne = new Repository(10.1);
        System.out.println(tenPointOne);

        Repository helloGenerics = new Repository("Hello Generics! ");
        System.out.println(helloGenerics);

        Repository today = new Repository(Calendar.getInstance().getTime());
        System.out.println(today);



        System.out.println("\n********* Access Values with the Right Type");

        Repository sixteen = new Repository(16);

        Integer integerVal = (Integer) sixteen.getValue();     // Access that Integer Value using sixteen.getValue().
        System.out.println("Accessing Integer: " +integerVal);  // Cast it to be a type of Integer.

        Repository fifteenPointOne = new Repository(15.1);

        Double doubleVal = (Double) fifteenPointOne.getValue();
        System.out.println("Accessing Double: " + doubleVal);

        Repository helloGenericsJava = new Repository("Hello Generics cast Java! ");

        String stringVal = (String) helloGenericsJava.getValue();    // Cast it to be a type of String  .
        System.out.println("Accessing String: " +stringVal);


        System.out.println("\n********Wrong cast get the ClassCastException");

        Repository today_1 = new Repository(Calendar.getInstance().getTime());

        String dateVal = (String) today_1.getValue();
        System.out.println("Accessing date (Wrong Cast!): " +dateVal);

        /* I cast it to be a type of String bcz i believe that i am holding the date in the String format.
        *This is the Wrong Cast- Observe that there are no Red Line or no compile time indication that
        *  anything is wrong with this code on line 46.
        * When you perform a String cast to today_1.getValue(), but the variable today holds within it a value
        * of type date.You have taken the value of type date and try to cast it to a string  */

    }
}

/*

1- With Just single Repository class,we are able to hold data of all types.So we don't have to create different classes
   based on the type of data we want held within the repository.

2- You have lost compile time checking of the kind of Object that you are holding within your repository.So each time you
   have to access the Object to get it to be of the right type of data,you need to perform a Cast.An whenever you are casting one type
    of data to another with in your code,there is a potential error.

3- At this point we perform cast to access the value held within the repository with the right data type.
   Let's see some issue that can arise with this structure that we have on line 44.Instantiate a new repository to hold a date Type.
   Now when i access this value from this repository,Let's say i Forget that this repository holds data of type DATE,its hard to keep
    track of the kind of data held within an object type.

4- we have proven to you the errors that you might encounter,when you are working with the object type within any class.
   We need to fix this and the one Solution that java Offers,which is a great solution,is the Use of Generics.

*
* */