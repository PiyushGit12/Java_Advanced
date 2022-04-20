package JavaCollectionsFrameWork.SetAndMaps;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String [] args){

        SortedSet<String> vowelSet = new TreeSet<>();

        vowelSet.add("A");
        vowelSet.add("E");
        vowelSet.add("I");
        vowelSet.add("O");
        vowelSet.add("U");

        System.out.println("Vowel Set are: " +vowelSet);
        System.out.println("First Vowels: " +vowelSet.first());
        System.out.println("Last Vowels: " +vowelSet.last());

        System.out.println("Vowels which come before I: " +vowelSet.headSet("I"));
        // I am accessing all vowels which come before I,Simple invoke vowelSet.headSet and pass in the element I.

        // If you are interested in all elements which come after a certain element in the ordering impose by the treeSet,you can
        //  use the tailSet Method.

        System.out.println("Vowels which come after I (Includes I): " +vowelSet.tailSet("I"));
        System.out.println("Vowels which come between E and U (Includes E): " +vowelSet.subSet("E","U"));





    }
}

/*
  1-The Sorted Interface also allows you to access all elements that come before a certain element.This done using the
     headSet Method.
  2- If you are interested in all elements which come after a certain element in the ordering impose by the treeSet,you can
     use the tailSet Method.

  3- SortedSet also allow you to access all elements in a range.So if you want to access vowels which come btw E and U,and this
     includes E, you simple invoke vowelSet.subSet,pass in the first element and the last element in the range.



*
*
* */