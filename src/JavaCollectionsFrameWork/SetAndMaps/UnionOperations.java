package JavaCollectionsFrameWork.SetAndMaps;

import java.util.HashSet;
import java.util.Set;

public class UnionOperations {
    public static void main(String [] args){


        Set<String> carSet = new HashSet<>();

        carSet.add("Chevrolet");
        carSet.add("HONDA");
        carSet.add("Ford");
        carSet.add("BMW");

        System.out.println("Cars Set Original Contents: " +carSet);

        Set<String> bikeSet = new HashSet<>();

        bikeSet.add("Yamaha");
        bikeSet.add("Suzuki");
        bikeSet.add("HONDA");
        bikeSet.add("BMW");

        System.out.println("\nBike Set Original Contents: " +bikeSet);

        System.out.println();

        System.out.println("************** UNION Operation");
        System.out.println("Cars Set Original Contents: " +carSet);
        System.out.println("Bike Set Original Contents: " +bikeSet);

        carSet.addAll(bikeSet);    // Call carSet.addAll and pass in bikeSet as an input argument.

        System.out.println("carSet Union bikeSet: " +carSet);

        System.out.println("\n**************Intersection  Operation");
        System.out.println("Cars Set Original Contents: " +carSet);
        System.out.println("Bike Set Original Contents: " +bikeSet);

        carSet.retainAll(bikeSet);

        System.out.println("carSet Intersection bikeSet: " +carSet);


        System.out.println("\n**************Difference  Operation");
        System.out.println("Cars Set Original Contents: " +carSet);
        System.out.println("Bike Set Original Contents: " +bikeSet);

        carSet.removeAll(bikeSet);

        System.out.println("carSet Difference bikeSet: " +carSet);

       System.out.println("carSet.equals(bikeSet): " + carSet.equals(bikeSet));  // This is the method that the Set uses to check whether two object are equal.
       System.out.println("carSet.hashCode() " +carSet.hashCode());
        System.out.println("BikeSet.hashCode() " +bikeSet.hashCode());

// hashCode is basically a hash of all of the member variables that Uniquely identify an object.



    }

}

/*

1-   carSet.addAll(bikeSet);   This addAll is what performs the Union Operation and the result of the Union is stored in the carSet.
      In Union Operation :- It returns the Common elements at JUST ONCE in the Final Union result,which are present in both of the Sets.

2- Intersection Operation:- The Intersection btw two sets gives us those elements that are present in both sets.Perform it using the
                          retainAll Method.Another words it gives a Common Elements present in both Sets.

3- Difference Operation:- This is where you removed the Elements of one set from another carSet.removeAll(bikeSet) will remove all elements from the
                      carSet,Which are common with the elements in bikeSet.

4- The Default implementation of the .equals method Simple compare the memory locations of the two objects.

5-

*
*
*
*
*
*
*   */