package JavaCollectionsFrameWork.SetAndMaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String [] args){


        Map<Integer, String> actorsMap  =new HashMap<Integer, String>();
        // I have instantiated a New HashMap.The HashMap is a specific Implementation of a Map.

        System.out.println("Actors Map Empty?: " +actorsMap.isEmpty());   // Give the Boolean Value.
        System.out.println("Actors Map Size: " +actorsMap.size());
        // The size will give me the no. of Keys Value Pairs that are present in this Map.

        actorsMap.put(1001,"Tom Hanks");
        actorsMap.put(1002,"Will Smith");
        actorsMap.put(1003,"Bruce Wills");
        actorsMap.put(1004,"Chris Evans");
        actorsMap.put(1005,"Brad Pitt");

        System.out.println("Actors Map Empty?(After Adding Names): " +actorsMap.isEmpty());
        System.out.println("Actors Map Size(After Adding Names): " +actorsMap.size());

        System.out.println("\nString Representation of Map: " +actorsMap);
        // NOw you can see that Every Key is equal to a Value.

        System.out.println("\n*********** Checking the HashMap InstanceOf ");

        Map<Integer, String> hashMap  =new HashMap<Integer, String>();

        System.out.println("hashMap instanceOf  HashMap: " + (hashMap instanceof HashMap));
        System.out.println("hashMap instanceOf  Map: " + (hashMap instanceof Map));
        // Both are InstanceOf hashMap and will return True.

        System.out.println("hashMap InstanceOf Collection: " +(hashMap instanceof Collection));
        System.out.println("hashMap InstanceOf Iterable: " +(hashMap instanceof Iterable));
       // Collection and Iterable Interfaces are not instanceOf hashMap and will return False.

        System.out.println("\n*********** Retrieving Elements on Map. ");

        System.out.format("Keys: %s, Value: %s\n" ,1003,actorsMap.get(1003));
        System.out.format("Keys: %s, Value: %s\n" ,1001,actorsMap.get(1001));

        System.out.format("Keys: %s, Value: %s\n" ,1008,actorsMap.get(1008));
        // if any Key Values are not present in map it will return Null.

        System.out.println("\n*********** Deleting Elements on Map. ");
        System.out.println("Actors (Original): " +actorsMap);

        actorsMap.remove(1003);
        actorsMap.remove(1004);

        System.out.println("Actors (After removing 1003,1004): " +actorsMap);

        System.out.println("\n*********** Updating  Elements on Map. ");
        System.out.println("Actors (Original): " +actorsMap);

        actorsMap.put(1003,"Aamir Khan");  // Re-assign new value to the associated Key which is removed before.
        actorsMap.put(1005,"SalMan Khan");

        System.out.println("Actors (After Update 1001,1005): " +actorsMap);


    }
}

/*
 1- A Map is a container,Which is part of Java Collection Framework,and a Map contains mappings from Keys to Values.Map as a
    Collection of Key Value Pairs.Maps are extremely useful data Structure in java.Maps allow you to look up Values given their Keys.
    So the map container is useful for very fast look-up based on keys.In order to be able to perform this fast look-up,the keys of
    a map have to be Unique.So a Key uniquely identifies the corresponding Value.The Values themself need not be Unique,but keys have to be.

2- Map can be a part of collection in that it contains a Collection of Objects,but a Map does not implement the Collection Interface.
*
3- The HashMap Basically hashes the keys of a map,allowing you to look-up values associated with Keys very,very quickly.

4-  Map<Integer, String> actorsMap  =new HashMap<Integer, String>();    I have Specified two-type arguments while instantiated this
    parameterized HashMap.The first type argument the Integer,refers to the type of the keys that we are going to store in the map.
    The second type argument,String refers to the type of the Values corresponding to each Keys.
    And instantiated the actorsMap and will invoke a few methods on this map.I'll check whether the actorsMap is Empty and the size as well.

5- Now,In order to add a new Key Value pair,You have to invoke the "PUT"Method on a Map.It's takes two argument.first it takes Integer and second one is
   String.
6- The Get Method allows me to look up a Value for a Particular Key.
7- If you want to remove entries in a Map,you can remove entries by specifying the Key.
8- Also Let's say you already have a Value associated with a certain Key and you want to update the value for that Key.you can use the
   PUT method for this as well.



       ******* Lets Look at its Interface Hierarchy **********

     1-A HashMap is one implementation of a Map.There are several other implementations.
     2-The HashMap also implements the MAP Interface.
     3-You should know that Map implementation in java do not implement the Collection or the Iterable Interface.So hashMap
     4- InstanceOf Collection and hashMap instanceOf Iterable will both return false.
     5- This means that methods that you would except from a Collection such as get,remove,add,ect are not available for a Map and
          Iterable method suggests iterating over a Map directly.
     6-


*

*
* */