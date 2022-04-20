package JavaCollectionsFrameWork.SetAndMaps;


// Maps do allow you a collection View into the entries that are present in the Map.
// There are methods on a Map that you can invoke to get a Collection View of the contents of a Map.

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsViewMap {
    public static void main(String [] args){

        Map<Integer, String> moviesMap = new HashMap<>();    //Setup a moviesMap, which is a HashMap with integer Keys and String Values.

        moviesMap.put(1202,"Titanic");
        moviesMap.put(1203,"Jaws");
        moviesMap.put(1501,"Back to the Future");
        moviesMap.put(1884,"The GodFather");
        moviesMap.put(2932,"Casablanca");
        moviesMap.put(6929,"Titanic");

        //Note: java Map implementations returns the same Collection object each time when we access the Collection View of a Map.
        Set<Map.Entry<Integer, String>> entrySet = moviesMap.entrySet();

        for(Map.Entry<Integer, String> entry: entrySet){
            System.out.format("Keys: %d, Value: %s\n",entry.getKey(),entry.getValue());
        }

        for(Map.Entry<Integer, String> entry: entrySet){

            if(entry.getKey() == 1884){
                entry.setValue("The GodFather II");
            }
        }
        System.out.println("\nSet View of the entries (Update): " +entrySet);



        Set<Integer> keySet =moviesMap.keySet();  // They KeySet Method gives me a Set View of all of the Keys in my Map.

        System.out.println("\nSet view of Keys(Will not have Duplicates): " +keySet);

        for(Integer key: keySet){
            System.out.println(key + " - " + moviesMap.get(key));
        }


        Collection<String> values = moviesMap.values();
        System.out.println("\nCollection view of Values (may contain duplicates): " +values );


        System.out.println("**********\n The Keys can be Null as well, Considered Unique");

        moviesMap.put(null,"3-Idiots");

        for(Map.Entry<Integer, String> entry: entrySet){
            System.out.format("Keys: %d, Value: %s\n",entry.getKey(),entry.getValue());
        }





    }
}

 /*
   1- Set<Map.Entry<Integer, String>> entrySet = moviesMap.entrySet();
      It's Possible for you to get a set representation of all of the key Value pairs in a map and you do this
       by accessing the entrySet.If you invoke moviesMap.entrySet();  You will get a set representation of a map where every element
       of the set is of type Map.Entry.
  2- Where Map.Entry element gives you access to the Key as well as the Value.Once you have the set you can iterate over this entrySet.

  3- This Map.Entry Object,Which represent a key Value Pair in a Map,also allow you to Update Values corresponding to Keys.

  4- You are Interested Only viewing the Keys.It's Possible for you to get a Set View of the Keys by Invoking the KeySet method.
  5-All of the Key in our map have to be Unique and this is why Keys are accessed as Sets.

  6- Maybe you just want to access all of the values in a Map.Possible by invoking the .Values() Method.
     Collection<String> values = moviesMap.values();   invoked  moviesMap.values() method and this gives me all of the Values in
     the Map in the form of Collection.Why a Collection? bcz Values can contains Duplicates.It's possible for values to be Duplicated.

  7- We can also store Nulls in a Map,Any no. of values in your map can be Nulls.
  8- Now what about Keys being Null? well,you can have a Null Key, but Only ONE Null Key.That's bcz a null value is considered
      a Unique Value.


 *
 **/

