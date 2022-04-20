package GenericsInJava.GenericsClasses;


// This class Holds any kind of data type bcz this is a Generics class.

public class Repository1<T> {

    public T value;


}



/*

1- Let's move on to an Elegant solution that java offers to work with data of different types using the same class, and that is the
   use of Generics in our code.
2- A Generics class is any class that supports a parameterized type.A Generics class is one that is parameterized over types.
    With in angular brackets, i have specified the type parameter T.This makes repository a GENERICS class.
    Now observe the value T that we have specified within  angular brackets.
3- T Here refers to the Type parameter of this class,and this T is actually a Placeholder for the different data types that can
    be held within this repository.
4- Another term for the type parameter T is type Variable.So if i say Type Parameter or Type Variable that refers to the T that i have
  Defined for this Generics class.

5- Now Why T? well that's a Convention.you can specify any other variable like name in Place of T.
   T here is a Placeholder, so T refers to any data type.Now the type of data that i want to store within this repository
   Should be any kind of data.
6- So the Value Member variable I defined to be of type T. Now Java recognizes that the type parameter T Specified with angular
   Braces within the class definition is the same type parameter T for the type of this member variable named Value.

7- public class Repository1<T>
    {  public T value;  }            This is our first very simple Generics Class parameterized with type T .

***********************************************************************************************************************************************************************




*
* */
