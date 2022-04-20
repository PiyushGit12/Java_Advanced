package JavaCollectionsFrameWork;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Our first Parameterized Collection here its the List,Specifically the ArrayList.
public class ParameterizedList {
    public static void main(String [] args){

        ArrayList<String> stringArraylist = new ArrayList<String>();  //I have instantiated a Parameterized ArrayList which contains
                                                                     // data of the type String.

        System.out.println("ArrayList Class: " + stringArraylist.getClass());
        // I am going to invoke stringArraylist.getClass() to see the type of the object that we have instantiated.

        System.out.println("\nArrayList instanceOf List: " + (stringArraylist instanceof List));
        System.out.println("ArrayList instanceOf Collection: " + (stringArraylist instanceof Collection));
        System.out.println("ArrayList instanceOf Iterable: " + (stringArraylist instanceof Iterable));

        System.out.println("\n******  Parameterized List Interface.");

        System.out.println("ArrayList instanceOf List<?>: " + (stringArraylist instanceof List<?>));
        System.out.println("ArrayList instanceOf Collection<?>: " + (stringArraylist instanceof Collection<?>));
        System.out.println("ArrayList instanceOf Iterable<?>: " + (stringArraylist instanceof Iterable<?>));

        /* I have invoke the instance of operator to show you that our Parameterized ArrayList is an instance of these Parameterized interfaces
        *   List, Collection and Iterable   */

    }
}


/*  1-   Arraylist<String> stringArraylist = new Arraylist<String>(); I have instantiated a Parameterized ArrayList which contains
         data of the type String.I have the data type specified as an ArrayList and within angular brackets <String>, i have specified that is an
         array list of strings.The data type specified  within angular brackets is the type parameter for this Parameterized array list.
*  2- ArrayList Is the instanceOf List,Collection,Iterable Interfaces.

 3-  Actually stringArraylist is an instance of the Parameterized List Interface.

*4- You can create parameterized list to store custom objects as well.
*     */