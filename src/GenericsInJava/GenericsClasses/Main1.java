package GenericsInJava.GenericsClasses;

import java.util.Calendar;
import java.util.Date;

public class Main1 {
    public static void main(String [] args){

        System.out.println("********* Generics Repositories ");

        Repository1<Integer> fifteen = new Repository1<Integer>();
        fifteen.value = 15;

        System.out.println("\nInteger Repository: " +fifteen.value);
        System.out.println("Integer Repository Holds an Integer class type: " +fifteen.value.getClass());

        Repository1<String> genericsString = new Repository1<String>();
        genericsString.value = "Hello String Generics type!";

        System.out.println("\nString Repository: " +genericsString.value);
        System.out.println("String Repository Holds an String class type: " +genericsString.value.getClass());


        Repository1<Date> today = new Repository1<Date>();
        today.value = Calendar.getInstance().getTime();

        System.out.println("\nDATE Repository: " +today.value);
        System.out.println("Date Repository Holds an Date class type: " +today.value.getClass());


        System.out.println("********* Such Instantiated of your Generics Types Repositories also allowed. ");

        Repository1<Integer> twenty = new Repository1<>();
        Repository1<Double> tenPointOne = new Repository1<>();
        Repository1<Float> fourPointOne = new Repository1<>();
        Repository1<Date> tommorow = new Repository1<>();



    }
}

/*

1-Now If I want a repository to hold data of type Integer, I'll instantiate a new Generic type where
    the value of the type I specify is Integer.I do this on line 8.
  public class Repository1<T>
    {  public T value;  }

2- The data type of the variable fifteen is of type repository and then within angular brackets I've specified Integer.
   Now this Integer within Angular Brackets will be filled in for the placeholder T that we have specified in the class definition.
   Then on the right rand side I have new repository and once again within Angular Brackets  I have specified the type that i want
   held within this repository.That is the type Integer.

3- We can do this with custom Objects as well.on line 24 I have Instantiated  a repository that hold DATE type Values.Sp the type
   Parameter that is the placeholder will be replaced by the data type DATE by the compiler.So today.value will hold a date instance.
   I Invoked Calendar.getInstance().getTime() to get the current date and time.

4- Now, when you are instantiating Objects of a Generics Type,It's not necessary for you to specify the type value on the right
   hand side of your initialization.


*   */