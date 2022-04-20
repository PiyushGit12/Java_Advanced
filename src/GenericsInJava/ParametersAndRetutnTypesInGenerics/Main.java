package GenericsInJava.ParametersAndRetutnTypesInGenerics;

import java.util.Calendar;
import java.util.Date;


// // Using Generics Types For Parameters and Return Types.

public class Main {
    public static void main(String [] args){

        System.out.println("***** String Representations of Generics Classes.");

        Repository<Integer> integerRepository = new Repository<>(15);
        System.out.println(integerRepository);

        Repository<Double> doubleRepository = new Repository<>(10.2);
        System.out.println(doubleRepository);

        Repository<String> stringRepository = new Repository<>("Hello Input type Generics argument ");
        System.out.println(stringRepository);

        Repository<Date> dateRepository = new Repository<>(Calendar.getInstance().getTime());
        System.out.println(dateRepository);


        System.out.println("\n***** Update and access values using Generics methods.");

        integerRepository.setValue(25);;
        doubleRepository.setValue(150.89);
        stringRepository.setValue("Setting a Generics value using a setValue Method.");
        dateRepository.setValue(Calendar.getInstance().getTime());

        System.out.println(integerRepository.getValue());
        System.out.println(doubleRepository.getValue());
        System.out.println(stringRepository.getValue());
        System.out.println(dateRepository.getValue());


        System.out.println("\n******************* Generic Class with Custom type");

        Car honda = new Car("Honda","Civic",21000);

        Repository<Car> carRepository = new Repository<Car>(honda);
        System.out.println(carRepository);


        System.out.println("\n*******************instantiated using its RAW type");

        Repository rawStringRepository = new Repository("Hello Java ");
        System.out.println(rawStringRepository);


    }
}


/*

1- Now When I instantiate the Repository class,I'm going to use the constructor,Which takes in the value of type T
   as an Input argument.on line 6.
   instantiated the new repository an integerRepository using new Repository.In this new command  I've specified an empty
   pair of angular Brackets,allowing java to infer the type held within this repository,that is thr Integer type.The value
   that I've specified here is the valid Integer 15.

2- I all of our Instantiations on line 14,17,20,23 we have made use of the single argument constructor,Which takes in data of type
   T as an input argument.

3- The Repository class implements a generic setValue and getValue method.Invoked the setValue methods on the different Repositories.
  to update the values held within those Repositories.

4- Any Generic class that you have defined,one that uses type parameters can be instantiated using its RAW type.

     What does it mean for the Java Compiler and the Java Runtime When we use a Parameterized class in its RAW form?
     Now Java consider all repositories to have the type value Object.It considers all values stored in the repository
     to belong to the base class Object rather than be of a particular type.So We've lost all type info. here when we use the
     raw form of the repository class.
     The Raw type as you know,is basically the same class without specifying the type parameter.

5-  The use of the raw Objects of generics classes can result in some subtle errors that are hard to track down at runtime.

**********************************************************************************************************************************************************
              **    Generic Class with Custom type   **

      Generic classes are able to handle Custom Objects as well.

 1- Defined a New Car Object on line 42 and Now that i have a Car Object instantiated,I have instantiated a repository
   Where the type value is the custom Car type,this is on line 44. I instantiated a new repository and on the right hand side I've
   Specified car as the data type within angular bracket as well.



* */
