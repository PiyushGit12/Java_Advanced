package JavaCollectionsFrameWork.SetAndMaps;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedMap {
    public static void main(String [] args){

        SortedMap<Integer, String> treeMap = new TreeMap<Integer, String>();
         // Instantiated a new treeMap, observe that the type of the variable is SortedMap.
        // This is the SortedMap that maps Integer values to Strings.


        treeMap.put(1202,"sam");
        treeMap.put(1503, "Tom");
        treeMap.put(1501,"Ronald");
        treeMap.put(1784,"Ursula");
        treeMap.put(1277,"Dan");

        System.out.println("Employee Map: " +treeMap);
        System.out.println("\n First Key: " +treeMap.firstKey());
        System.out.println(" Last Key: " +treeMap.lastKey());


        System.out.println("\n Map with all Keys Strictly less than 1501: " +treeMap.headMap(1501));
        System.out.println("\n Map with all Keys Greater than or equal to 1503: " +treeMap.tailMap(1503));
        System.out.println("\n Map with all keys greater than or equal to 1277 and less than 1503:"
                 +treeMap.subMap(1277,1503));



//        Comparator<String> stringLengthComparator = new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.length() - s2.length();
//            }
//
//        };
//
//        SortedMap<String, Integer> myMap = new TreeMap<String, Integer>(
//                stringLengthComparator);
//
//        myMap.put("Peter", 8);
//        myMap.put("Harry", 2);
//        myMap.put("John", 5);
//        myMap.put("Jack", 3);
//
//        for (Map.Entry<String, Integer> entry : myMap.entrySet()){
//            System.out.print(entry);
//        }




    }
}

/*

  1- The entries of the treeMap will be in the natural order of the Keys,which are Integers.
  2- The SortedMap also exposes a no. of helper methods to access a subset of the entries n the map.
  3- The headMap method in the sorted map,which takes in as an input argument of value for a Key,will give me all of the keys,
     which are strictly less than the key specified here that is 1501.
  4- Let's say you are interested in all keys which are greater than or equal to 1503.Use the tailMap method,pass in 1503
    as an input argument.That will give me all entries where the keys are greater than the value specified.
  5- You maybe interested in a subset of the values within a range of keys.So if you want a map with all keys greater than or equal to
     1277 and less than 1503, use the subMap method.





* */