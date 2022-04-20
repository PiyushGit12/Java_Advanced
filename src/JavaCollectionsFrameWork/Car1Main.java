package JavaCollectionsFrameWork;

import java.util.ArrayList;
import java.util.List;

public class Car1Main {
    public static void main(String [] args){


        ArrayList<Integer> intList = new ArrayList<Integer>();   // Type argument is the rapper type Integer.

        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);

        System.out.println("Integer List: " + intList);

        intList.add(null);
        System.out.println("Integer List(after adding Null): " +intList);




    }
}


/* 1- ArrayList<int> intList = new ArrayList<int>(); :- The type argument for any generic or parameterized type cannot be of primitive type.

2- So instead of using a primitive type which result in a compile time error.use a reference type.All of the primitive types that we
    Specify in java have corresponding wrapper types that are object reference of the same type.So instead of int specify the uppercase "Integer"
     to be the type of data that you store within your Arraylist or any other collection.{ ArrayList<Integer> intList = new ArrayList<Integer>(); }

3- Collections except reference or object types you can add null values to collections as well.
4- All of the methods invocations that we have performed on the ArrayList as far are methods that belong to the collection interface.
   { Collection<String> cityList = new  ArrayList<>();  }

 5- Now our ArrayList also Implements the List interface, in addition to implementing the collection interface.
    { List<String> cityList = new  ArrayList<>();  } .the list Interface derives from  the Collection interface.
6- All of the methods in the collection interface as also available in thr list interface.

7-

 */