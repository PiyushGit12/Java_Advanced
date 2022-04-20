package JavaCollectionsFrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String [] args){


        java.util.List<String> cityList = new ArrayList<>();

        System.out.println("\n\n******Adding  Elements");
        cityList.add("Lucknow");
        cityList.add("Pune");
        cityList.add("GOA");

        System.out.println("City List: " +cityList);
        System.out.println("City List Size: " +cityList.size());

        System.out.println("\n\n******Adding  Elements at specified index");
        cityList.add(0,"Bengaluru");
        cityList.add(1,"Mumbai");

        System.out.println("City List: " +cityList);
        System.out.println("City List Size: " +cityList.size());

        // We can manipulate list by adding elements to specific index positions.


        System.out.println("\n\n****** Access  Elements at specified index");

        System.out.println("City List Size: " +cityList.size());
        System.out.println("Element at index 0: " +cityList.get(0));
        System.out.println("Element at index 2: " +cityList.get(2));
        System.out.println("Element at index 4: " +cityList.get(4));
        System.out.println("Remove Element at index 3: " +cityList.remove(3));
        System.out.println("City List Size after removing index 3 element: " +cityList.size());
        System.out.println("City List after removing index 3 element: " +cityList);

        // we can also  access elements at specific positions for list as well.

        System.out.println("\n\n************* List can contain duplicates ");
        System.out.println("CityList Original Contents: " +cityList);

        cityList.add("goa");
        cityList.add("bengaluru");
        cityList.add("Indoor");
        cityList.add("lucKNOW");

        System.out.println("CityList Contents after adding: " +cityList);
        // Duplicate are perfectly valid in a list.


        System.out.println("\n\n************* Find the index position of an Element ");
        System.out.println("CityList Original Contents: " +cityList);

        //NOTE:- That this finds the first position of the Element from the beginning of the list
        System.out.println("Mumbai is at the index: " +cityList.indexOf("Mumbai"));
        System.out.println("Indoor is at the index: " +cityList.indexOf("Indoor"));
        System.out.println("GOA is at the index: " +cityList.indexOf("GOA"));

        System.out.println("lucKNOW is at the lastIndexOf: " +cityList.lastIndexOf("lucKNOW"));


        System.out.print("****************** The Iterable interface allows iterating over lists ");

        Iterable<String> cityListIterable = cityList;  // Now lets assign the cityList to a variable that is of type Iterable.

        System.out.println("City List: " +cityList);

        for(String city: cityListIterable){
            System.out.println(city);
        }

        System.out.println("\n**********  Under the Hood of the for-Each Loop");

        Iterator<String> iterator = cityListIterable.iterator();
        //Invoked the iterator method on the cityListIterable, and this returns an iterator object.


        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());


        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
        System.out.println("Iterator next(): " +iterator.next());

        System.out.println("Iterator hasNext(): " +iterator.hasNext());
//        System.out.println("Iterator next(): " +iterator.next());
        // you Will get a error msg there is " no such element Exceptions" bcz there is no elements present in the list.



    }
}

/* 1-List are Ordered Collections,which means every element in a list is associated with an index position and we can manipulate lists using these indexes.
   Not all collections are ordered.
2- We can manipulate list by adding elements to specific index positions. In fact we can access elements at specific positions for list as well.
    This is only possible for list and not for all Collections.

3- Another very important characteristic of the list data type is that it can contain "duplicates".List can contain multiple elements that
  are exactly same.Other collections such as sets, for example cannot contain duplicates.

4- Now the "indexOf" method finds the first position of the Element from the beginning of the list.This is bcz a list may contain duplicates and our list indeed does.
   We use the "indexOf" method on a list to look up the index positions of elements.

5- .add and lastIndexOf method is not available in List Collection interface.



    ..............Iterable Interface in List...........

    Iterable<String> cityListIterable = cityList;   This will allow us to see what the Iterable interface allows us to do with the list.
     As its name suggests, an Iterable allows us to iterate over the Elements in a List.That's the whole point of the Iterable.
     And Iterable gives us access to an iterator object and the iterate allow us to access the elements of a collection in some sequence.

1- Let's now access the iterator manually and iterate over the elements of our list in sequence.
2-  Iterator<String> iterator = cityListIterable.iterator();
        //Invoked the iterator method on the cityListIterable, and this returns an iterator object.
    This an object that implements the iterator interface.and this is a parameterized interface.Now the iterator interface has two methods.
    These are two methods used to iterate over the elements of a collection in sequence.
  hasNext:-simply tells us whether there is indeed a next element after the Current one.hasNext only return true or false,In order to actually
        access the next element in sequence,you need to invoke the next method on the iterator interface.
  Next:- Allows us to access that next element and moves the pointer of the iterator one forward.

  */