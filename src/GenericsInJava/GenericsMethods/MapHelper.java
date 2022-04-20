package GenericsInJava.GenericsMethods;

// Parameterized Classes to Call Parameterized Methods

import java.util.Map;

public class MapHelper<K, V> {

    public void addEntries(Map<K , V> map, K[] keys, V[] values){

        int index = 0;
        for(K key: keys){
            map.put(key, values[index]);
            index++;
        }

    }

    public void printEntries(Map<K, V> map){

        System.out.println("**********Map Entries");

        for(Map.Entry<K, V> entry : map.entrySet()){
            System.out.println(entry);
        }

        // I run a For-Each Loop which iterates over all of the entries of this map.Observe that the Map.Entry Object is also
        //parameterized using K, V.So Every entry will be an entry form key of type K to value of type V.
    }


}


/*

 1- SetUp the class MapHelper within angular brackets ,I've specified two type parameters to the class K and V.NOw this shows up
    we can Specify multiple type parameters for classes as well.A class is not restricted to just a single type parameter.

 2- Multiple type parameters are specified using different names and are separated by Commas.
    The first type used to parameterize the MapHelper class is specified using the type parameter K.
    The second type used to setup this class is specified using the type parameters V.
    With this we made the MapHelper a generics class that accepts type parameters.We can now use these type parameters
    in the method that we defined within MapHelper.

 3- addEntries and printEntries both are Utility methods.

 4- public void addEntries(Map<K , V> map, K[] keys, V[] values) : Notice that the type of map we pass into this method contains
    Keys of type K and Values of type V.Remember these type parameters are simply placeholders,the type values for these type parameters
    when we actually instantiate the MapHelper object and invoke these methods.
 5- The next Input argument to the addEntries method is an array of Keys.The type of the key is K.
    The Third Input argument to the map is an array of Values,values are of type V.

 6- Now This MapHelper class will work with Keys and Values of any Type.





* */