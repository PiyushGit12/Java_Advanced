package JavaCollectionsFrameWork;
import java.util.Arrays;

public class Array {

    public static void main(String [] args){


        int [] intArray =  new int[4];

        intArray[0] = 10;
        intArray[1] = 20;

        System.out.println("Array of integers: "+ intArray);    //Want to see the default toString Representation of an array.
        System.out.println("getClass() Representation: " +intArray.getClass());
        System.out.println("toString() Representation: " +intArray.toString());
        System.out.println("toString() Representation: " +Arrays.toString(intArray));   // View the content of an array.

        System.out.println("\nFloat Array representation*****************");

        float [] floatArray = new float[6];

        floatArray[1] = 10.5f;
        floatArray[5] = 20.5f;

        System.out.println("\nArray of Floats: "+ floatArray);    //Want to see the default toString Representation of an array.
        System.out.println("getClass() Representation: " +floatArray.getClass());
        System.out.println("toString() Representation: " +floatArray.toString());
        System.out.println("toString() Representation: " +Arrays.toString(floatArray));   // View the content of an array.

        System.out.println("\nString  Array representation*****************");

        String [] stringArray = new String[7];

        stringArray[1] = "Good";
        stringArray[2] = "Morning";

        System.out.println("\nArray of Strings: "+ stringArray);    //Want to see the default toString Representation of an array.
        System.out.println("getClass() Representation: " +stringArray.getClass());
        System.out.println("toString() Representation: " +stringArray.toString());
        System.out.println("toString() Representation: " +Arrays.toString(stringArray));   // View the content of an array.



    }
}

/* int [] intArray =  new int[4];
       I have int ,and then i have square brackets[] and the name of the array is an intArray.The square brackets[] is what denotes java that this
       is an array type.On the right hand side,i have new int and within square brackets, i have specified 4 indicating that this is an array with 4 Elements.and the
       primitive type of integers.Arrays can be created of primitive types as well.
       intArray here is a collection which can hold a maximum of 4 elements and they have to be the primitive type int.
       How do you assign values to an array? we use indexing to add values to an array:-intArray[0] = 10;
       The Array itself is an object in Java and every object in java has a corresponding class.
*

1- Now the toString Representation of an array in java by default,the class of the object,which in the case of an array of primitive integer types is simple
  the open square brackets and the capital I (Means integer type array),and then we have the @ sign and then a Representation of the memory location: [I@1b6d3586   where the object has
   been created and where the contents will be stored.

 2- Unfortunately,the default implementation of toString method in java does not print out the contents of an array when you call toString on an array.
    A way to view the contents of an array is to use the Arrays utility class.So if you want to view the contents,simply pass in your intArray to Arrays.toSting.
    see on line 17.

 3- Even though we have values for only two elements in this array,we have up space for all four elements.So the Array takes up space that you have Allocated for it
    based on the no. of elements.Even if you store only a few elements in the array,the entire memory is reserved for your array.

4- If we not assign value to an array by default its have been initialized to 0.

5- Arrays of objects,the value that are not set on an array,are all set to NULL by default.

*     */