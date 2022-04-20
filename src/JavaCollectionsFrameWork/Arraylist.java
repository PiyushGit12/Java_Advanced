package JavaCollectionsFrameWork;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Arraylist<S> {
    public static void main(String [] args){

        ArrayList arrayList = new ArrayList();
        // I have instantiated a new ArrayList which is a NON-parameterized ArrayList.

        System.out.println("ArrayList class: " + arrayList.getClass());

        System.out.println("\nArrayList instanceOf List: " + (arrayList instanceof List));
        System.out.println("ArrayList instanceOf Collection: " + (arrayList instanceof Collection));
        System.out.println("ArrayList instanceOf Iterable: " + (arrayList instanceof Iterable));

        System.out.println("\nArrayList initial Contents: " +arrayList);
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println("*************** Adding Elements");

        arrayList.add("EUR");
        arrayList.add("USD");
        arrayList.add("GBR");
        arrayList.add("INR");
        arrayList.add("JPY");


        System.out.println("\nArrayList Contents: " + arrayList);
        System.out.println("ArrayList Size : " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());


        System.out.println("*************** Removing Elements");

        arrayList.remove("EUR");
        arrayList.remove("GBR");
        // So if you specify EUR or GBR in lowercase, this .remove will not work.

        System.out.println("\nArrayList Contents: " + arrayList);
        System.out.println("ArrayList Size : " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println("\n*************** Checking for  Elements");

        System.out.println("ArrayList Contains USD: " +arrayList.contains("USD"));
        // the arrayList will use the .equals method on the Object that you are passing in to check for equality and to have this contains
        // method return true or false.
        System.out.println("ArrayList Contains EUR: " +arrayList.contains("EUR"));
        System.out.println("ArrayList Contains JPY: " +arrayList.contains("JPY"));

        System.out.println("ArrayList Size: " +arrayList.size());


    }
}

/*  List:-
*        1- The List is essentially an ordered collection of objects.ordered bcz the sequence or the order matters.There is an element
*           in the first position,second position,third position and so on..Lists can contain duplicates and they have an inherent order.
*
* 2- The ArrayList in the java collections framework gives you a no. of helper methods to work with the elements of this collection.These helper method
*    are part of interfaces and every list implements these three interfaces List,Collection,Iterable. Every arrayList is an instance of the List interface,Collection Interface
*     Iterable Interface. Each of these interfaces add some different functionality to your arrayList.
* 3- ArrayList or any list is an ordered collection.
*
* 4- It was very easy to add elements to an arrayList.Its just as easy to remove elements from an arrayList.For each Object that you want to remove,
*    the arraylist will use the .equals method to check for the equality of objects,and when a match is found,that object will be removed.
*
* 5- So if you are interested to know the list contains certain elements you can use the  {.contains method} on the arrayList object.
*
* 6- Three method .add,.remove,.contains that we invoked on this non parameterized arrayList are actually part of the  "List interface", and I'll prove this
*    by changing he type of my arrayList variable to be List rather than arrayList and everything works fine.{ List arrayList = new ArrayList();  }
*     and these methods are available for all kind os lists not just arrayLists.
*
* 7- And arrayList are also actually the part of the  "Collection interface", as well { Collection arrayList = new ArrayList();  }
*
* 8- Now let's change the type of our arrayList variable to be Iterable rather than Collection or List. we see isEmpty(),.add,.remove,.contains are not
* the part of this interface this is bcz iterable interface does not implement the methods that we have invoked on the arrayList .
* So isEmpty(),.add,.remove,.contains, .size is not part of Iterable interface.
*
*     */