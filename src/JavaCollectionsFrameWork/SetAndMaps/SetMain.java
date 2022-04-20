package JavaCollectionsFrameWork.SetAndMaps;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String [] args){

        HashSet<String> carSet = new HashSet<>();

        carSet.add("BMW");
        carSet.add("VolVo");
        carSet.add("Ford");
        carSet.add("Mazda");

        System.out.println("Cars Set: " +carSet);

        System.out.println("\n*************** Duplicates are not Allowed in sets");

        carSet.add("BMW");
        carSet.add("Ford");

        System.out.println("Cars Set After adding duplicates: " +carSet);

        System.out.println("\n*************** Null Values Allowed in sets");

        carSet.add(null);
        carSet.add(null);
        carSet.add(null);

        System.out.println("Cars Set After adding Null: " +carSet);


        System.out.println("\n*************** Perform a bunch of InstanceOf checks..");

        HashSet<String> hashSet = new HashSet<>();

        System.out.println("hashSet InstanceOf HashSet:- " +(hashSet instanceof  HashSet));
        System.out.println("hashSet InstanceOf Set:- " +(hashSet instanceof Set));
        System.out.println("hashSet InstanceOf Collection:- " +(hashSet instanceof Collection));
        System.out.println("hashSet InstanceOf Iterable:- " +(hashSet instanceof  Iterable));

        // So hashSet is an InstanceOf the HashSet,Set,Collection,Iterable interface.just like List implementations.
        // So you can see that hashSet implements all of these Interfaces.


        System.out.println("\n*************** Add Elements carSet1 Collection....");

        Set<String> carSet1 = new HashSet<>();

        carSet1.add("Suzuki");
        carSet1.add("Ferrari");
        carSet1.add("Jaguar");
        carSet1.add("Ford");
        carSet1.add("Lamborghini");

        System.out.println("Cars Set 1 Original Contents: " +carSet1);

        System.out.println("\n*******************Can  Remove Elements from Sets");

        carSet1.remove("Ford");
        carSet1.remove("Suzuki");

        System.out.println("After Removed Ford and Suzuki from sets the remanings Sets:  " +carSet1);


    }
}


/*   1- Set :- Unordered Collection of Elements which do not allow Duplicates.Every elements that you add to a set is unique.In fact, has to be
           Unique.A set will ensure that no duplicates are added.In addition there is no inherent ordering to the elements present in set.
           and most commonly used one is the HashSet.
2-  HashSet<String> carSet = new HashSet<>();   So this is HashSet of String Elements.

3- The order is really not relevant and does not matter in Sets.Elements can be store and accessed in any order,and that's totally fine.

4- How Does the set implementation identify an object as a duplicate of another object?
    This is done using " Equality Checks ". Equality Checks are performed using the .equals() and .hashCode() method on object.If two object are equal to one
    another and their hashCode is the same, well those two objects are considered Duplicates bcz hasSets the hash code of objects to determine
    whether two object are equal.That's why they are called  the hash Set.

5- Null Values are consider equal to one another.Null is the  same as another Null.So this will be deduped.Addedd three Null values in set.
   Once the first Null was added to the set,the HashSet realized that other Null values were the same as an object already in the set,So they were
   deduped and not added..

6- The HashSet is one particular implementation of the set available in java.It's the most commonly used implementation. Java supports other
    implementation as well such as Linked HashSet, the TreeSet and so on....

7- So hashSet is an InstanceOf the HashSet,Set,Collection,Iterable interface.just like List implementations.So both Sets as well as Lists are
   Collections and Iterables.

8- Sets are basically just Collections,which means you can remove elements from a Set as well.
*
*
*
* */