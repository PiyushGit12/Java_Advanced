package GenericsInJava.ParametersAndRetutnTypesInGenerics;

// Using Generics Types For Parameters and Return Types.

public class Repository<T> {


    public T value;

    public Repository(T value){    //  Constructor which takes in a single input argument and a Value of type T.
        this.value = value;        // Assign this value to my member variable.
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return String.format("Repository Contains: %s", value);
    }





}


/*

1- Now,you can see that generics types can be applied to input arguments specified to
    constructors and methods as well as return values.

2- public class Repository<T>. T is the placeholder and when we instantiate Objects of type repository will specify
   a value for this placeHolder and the same value will replace all the other instances of T in this class for the Member
    variable,the Constructor,the getValue and the SetValue methods.

       ** Limitation of Using Generics classes(What is not Allowed)  **

1- Once you have generic class with the type parameter T,the type parameter CANNOT be used to define and declare
   Static variables in that class.example: Public Static T staticVariable;
   The type parameter is associated with an instance of the repository class.It's associated with an Object of the repository class.
   So this type parameter cannot be used with static definitions inside the class.

2- We know that static members,whether they are member variables or methods,are associated with the class itself and not
  With Objects of the class.

3- The value of the type parameter is associated with the Object of the repository class and not with the class itself.



* */