package GenericsInJava.GenericsMethods;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String [] args){

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};                       //Array of Integers.
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};   //Array of Strings.

        MapHelper<Integer, String> mapHelper1 = new MapHelper<>();

        mapHelper1.addEntries(studentNamesMap,studentIds,studentNames);

        mapHelper1.printEntries(studentNamesMap);


        Map<Integer, Double> studentScoresMap = new HashMap<>();

        Double[] studentScores = new Double[] {3.2, 5.4, 6.8, 9.56};

        MapHelper<Integer, Double> mapHelper2 = new MapHelper<>();

        mapHelper2.addEntries(studentScoresMap,studentIds,studentScores);

        mapHelper2.printEntries(studentScoresMap);



    }
}



/*
 1- This is a map from integer to String,the studentNamesMap.This is a new HashMap.
 2- MapHelper<Integer, String> mapHelper1 = new MapHelper<>();   mapHelper1,this is a map helper which can help us with
    mappings of Integer to String.This is Generics class and i have specified the type values for this class as Integer and String.
    Integer corresponds to K that is the Key and String corresponds to V,that is the Value.

 3-  The MapHelper has been instantiated with the Integer for the K type Parameter and the value String for the V type parameter.
 4- mapHelper1.printEntries(studentNamesMap); :- the input argument to printEntries is also specified using our parameterized type.
   A mapping from K to V,where K is an Integer and V is an value.

 5-Now,If you want to use the same MapHelper with different types for Keys and Values,you need to Instantiate another MapHelper Object.
   this is exactly what i have done on line 25. MapHelper<Integer, Double> mapHelper2 = new MapHelper<>();

 6- MapHelper<Integer, Double> mapHelper2 = new MapHelper<>();
    MapHelper<Integer, String> mapHelper1 = new MapHelper<>();  Two mapHelper object there.
    This is required bcz we have Parameterized the MapHelper class,So we need instantiate different objects of map helpers,
    If you are working with different type Values.


* */