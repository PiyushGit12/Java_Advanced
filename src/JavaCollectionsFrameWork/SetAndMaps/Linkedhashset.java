package JavaCollectionsFrameWork.SetAndMaps;

// There are other sets that implements these interface as well,Such as the LinkedHashSet.

import java.util.*;

public class Linkedhashset {
    public static void main(String [] args){


        Set<String> linkedHashSet = new LinkedHashSet<>();

        System.out.println("********** Checking linkedHashSet is an instanceOf these Interfaces.");
        System.out.println("linkedHashSet InstanceOf linkedHashSet:- " + (linkedHashSet instanceof  LinkedHashSet));
        System.out.println("linkedHashSet InstanceOf HashSet:- " + (linkedHashSet instanceof HashSet));
        System.out.println("linkedHashSet InstanceOf Set:- " + (linkedHashSet instanceof  Set));
        System.out.println("linkedHashSet InstanceOf Collection:- " + (linkedHashSet instanceof Collection));
        System.out.println("linkedHashSet InstanceOf Iterable:- " + (linkedHashSet instanceof  Iterable));

        Set<String> treeSet = new TreeSet<>();

        System.out.println("\n********** Checking TreeSet is an instanceOf these Interfaces.");

        System.out.println("treeSet InstanceOf TreeSet:- " + (treeSet instanceof  TreeSet));
        System.out.println("treeSet InstanceOf SortedSet:- " + (treeSet instanceof SortedSet));
        System.out.println("treeSet InstanceOf Set:- " + (treeSet instanceof  Set));
        System.out.println("treeSet InstanceOf Collection:- " + (treeSet instanceof Collection));
        System.out.println("treeSet InstanceOf Iterable:- " + (treeSet instanceof  Iterable));


        System.out.print("\nQuick Look at the ordering of Elements across these different Set Implementation.  ");

        String[] carsArray=  new String[] {"Volvo","BMW","Honda","Audi", "Mercedes"};

        Set<String> hashSet = new HashSet<>(Arrays.asList(carsArray));    //  it returns in a random order
        Set<String> linkedHashSet1 = new LinkedHashSet<>(Arrays.asList(carsArray));   // Elements are Accessible in the Insertion order.
        Set<String> treeSet1 = new TreeSet<>(Arrays.asList(carsArray));
        // I have Initialized  all of these Sets Using the Elements in the carsArray.

        System.out.println("\nOrder of Car Names in a HashSet (Random order)");

        for (String name: hashSet){
            System.out.println(name);
        }


        System.out.println("\nOrder of Car Names in a LinkedHashSet (Insertion order)");

        for(String name: linkedHashSet1){
            System.out.println(name);
        }

        System.out.println("\nOrder of Car Names in a TreeSet will be Alphabetical order(Natural order)");

        for(String name: treeSet1){
            System.out.println(name);
        }

        Integer[] integersArray = new Integer[] {3300,400,100,700,900,600};

        Set<Integer> treeSet2 = new TreeSet<>(Arrays.asList(integersArray));

        System.out.println("\nOrder of integers in a TreeSet will be Ascending order (Natural order)");

        for(Integer name: treeSet2){
            System.out.println(name);
        }





    }
}

/*

1- linkedHashSet:- linkedHashSet is actually a hashSet.In Addition,it maintains a linked list of the elements added to that Set.
          So the linkedHashSet is an instanceOf the HashSet.It also an instance of the set,Collection,Iterable Interfaces.

2- Another interesting Set Implementation that java offers is the "TreeSet".The TreeSet Stores its elements in a red-black tree
   and orders its elements based on their values.bcz the treeSet imposes an explicit ordering on the Set Elements,working with the
   TreeSet is Substantially slower than working with the HashSet or the LinkedHashSet.
3- The TreeSet essentially implements an additional interface beyond the Set Interface.And that interface is that of the SortedSet.
   that's bcz the treeSet always stores the set Elements in some sorted Order.

4- The linkedHashSet is essentially a hashSet along with a linked list implementation,Which means when you iterate over the elements
  in a linkedHashSet,you should get the element in the order that they were inserted into set.The linkedHashSet satisfied all of the other
  properties of sets,no duplicates are allowed.But it also allows us to iterate over the elements in insertion order.

5- The TreeSet Will impose the natural order of elements on the objects that we have added to the set.In the case of string this natural order
    is the Lexicographical or Alphabetical order.It doesn't matter in what order these elements were added.In the case of Integer set will return
    these elements to me in the ascending order by default.

6- The TreeSet does not accept the Null values bcz it's hard to tell where exactly null fits in the natural order of elements.Adding Nulls to a
    treeSet results in a NullPointerException.


*
*
*
* */