package JavaCollectionsFrameWork;

import java.util.ArrayList;

public class CarMain {
    public static void main(String [] args){


        ArrayList<Car> carList = new ArrayList<>();  // Instantiate a generic parameterized ArrayList to hold car Objects.


        carList.add(new Car("Honda","Civic",21000.0));
        carList.add(new Car("Toyota","Camry",29000.0));
        carList.add(new Car("BMW ","5 Series",21000.0));

        System.out.println("CarList: " +carList);

//        carList.add("Merecedes");
//        carList.add(5);
//        carList.add(true);
//        carList.add(10.45f);

        // The compiler knows that my car list can contain only car objects.You can't add Strings,Boolean,Float,Integer ,no type other than car.


        ArrayList nonGenericCarList = new ArrayList<>(); // Setup a non parameterized or a Non-generic car list.


        System.out.println("\n****************Setup a non parameterized or a Non-generic car list. ");

        nonGenericCarList.add(new Car("Honda","Civic",21000.0));
        nonGenericCarList.add(new Car("Toyota","Camry",29000.0));
        nonGenericCarList.add(new Car("BMW ","5 Series",21000.0));

        System.out.println("Non-generic car list: " + nonGenericCarList);


        // Lets work with parameterized or the generic list first.
        System.out.println("\n****** NO Casting required to access list elements");

        for(Car car: carList){
            System.out.format("\n%s, %s ,%.1f", car.getMake(), car.getModel(), car.getPrice());
        }

        //If you want to iterate over all of the objects in your car list,you can see that we access each object in the list with the
        // Right data type the Car data type.Once we have the car object,we can access the methods of the car Object.



        System.out.println("\n\n******* List Element have to be cast to the right type ");

        for (Object object: nonGenericCarList){   // I iterate over the elements in the nonGenericCarList with the Object data Type.bcz that is a non-parameterized array list.
            Car car = (Car) object;
            System.out.format("\n%s, %s ,%.1f", car.getMake(), car.getModel(), car.getPrice());
        }


    }
}

/* 1- ArrayList<Car> carList   :- This is an ArrayList where type argument is the car Class.and then i Instantiate{new ArrayList<>(); }
      a new ArrayList.I do not need to specify the type within angular brackets.The type will be inferred  by java.
*2- Thus you can see that using  parameterized collections give you additional type safety.Java will ensure that you only add data of the
     right type to your collections.
*
3- I have instantiated a Non-genericCarList,I KNow this is Non parameterized bcz the data type of the Non-genericCarList variable is simple
   ArrayList.I have not specified any Type argument.

4- If you want to iterate over Non-generic car list,we can't use the right data type for the car objects.You have to use the Object data type.
5- Car car = (Car) object; // Then i order to get car objects I hav perform a cast.I have to cast every object to be of type car and store it
   in a separate variable car.Only then i can access the getMake,getModel,getPrice methods.
*6- Car car = (Car) object;  Now this cast is dangerous bcz just in case there is an object that is not of type Car that be a runtime Exception.

7- Note:-In the case of a non-generic or a non-parameterized list,there is always a casting operation that you need to perform when you
    access the elements of that List.


  */