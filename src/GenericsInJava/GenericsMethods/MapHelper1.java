package GenericsInJava.GenericsMethods;

import java.util.Map;

public class MapHelper1 {

    public static <K, V> void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }

    }

    public static <K, V> void printEntries(Map<K, V> map) {

        System.out.println("**********Map Entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

//    public static <T> void displayElements(T element1, T element2) {
//
//        System.out.println("************ Some Elements with same parameter");
//        System.out.format("Element 1: %s, Element 2: %s\n", element1, element2);
//    }
    //  We can invoke same types of data and different types of data as well from above method.

    public static <T, S> void displayElements(T ele1, S ele2) {

        System.out.println("************ Some Elements with different parameter");
        System.out.format("Ele 1: %s, Ele 2: %s\n", ele1, ele2);
    }
    // This is much better,much  clearer definition of a parameterized method as compare to displayElements.


    public static <T> void displayElement(T... elements){
        System.out.println("++++++++++ Some varargs type ");

        for(T element : elements){
            System.out.println(element);
        }

        //We simply iterate over every element in the input varargs elements.Elements here will Simply be an array containing
        // objects of type T and we print out every individual element.
    }


}



/*

 1- You cannot use Generics types for static variables.
 2- So,If you want to use parameterized types for static methods,you need to do things a little differently.

 3- You need to specify the parameterized types for each METHOD individually.
    example- public static <K, V> void printEntries(Map<K, V> map) : -I have added within angular brackets just after the
    Keyword static and before the return type void within angular brackets are specified K,V indicating that these are the type
    parameters for this method alone.
    What we have done here is essentially changed printEntries to be a generics method.This is a valid generic method definition
    Where the generic type parameters applied to the method.Done exactly same thing with addEntries method.

 4- public class MapHelper1<K, V> :- Now you can head over to MapHelper1 class and get rid of the K,V which is a part of class definition.
   MapHelper1 will be a NON-Generic class.It can be a regular class and it does not need to have type Parameters.

 5-Are static method within the MapHelper1 Utility class have been parameterized using type Parameters?
   MapHelper itself does not need to be a generic class.

 6- public static <T> void displayElements(T element1, T element2)  :- This is the generic method bcz of parameterized this
    method using the type parameter T.displayElements accept two elements as input arguments,element1 and element2 and have
    Specified that both of these elements are of type T.

 7-main thing to Note here is that the type T applies to both element1 and element2.
   So the generic type parameter T here is replaced with the actual type T.
   We can invoke same types of data and different types of data as well from displayElement method.


 8- Even when you use the same type parameter T,different input arguments can be of different data types.It's often better
    to make this explicit in your code.I have specified two genetic type parameters T,S.
    public static <T, S> void redisplayElements(T ele1, S ele2)
    Now the first element is of type T,the second element is of type S. ele1 and ele2 can have different data Types.

9- Parameterized methods can also be used to accept input arguments that are of the varargs type.
   Observe that the input argument to displayElement is basically a varargs type.
   varargs types are specified by specifying the data type followed by the three dots that you see on line 41.
   Now the implementation of this method is straightforward.

10- The Elements are stored in varargs type input arguments can be of different DATA Types.

* */

