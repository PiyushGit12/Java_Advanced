package GenericsInJava;

public class Repository {

        private Object value;     // Now once you hold an object member variable,you can store any kind of data within
                                 // this repository bcz all data types are essentially Objects.

    public Repository(Object value){
        this.value = value;               // Assigns this Object to my member variable Value.
    }

    public Object getValue() {
        return value;                // Returns the Type Object.
    }

    @Override
    public String toString(){
        return String.format("Repository Contains: %s  of type: %s", value,  value.getClass());
    }






}

 /*

 1- We know that all reference types in java inherit from the base Object class,So I'm going to have this repository hold a
    variable of type Object.
2 - Storing an Object data type within this repository will mean changing the constructor.
3- So we can see that the Object can contain different types of data.




 *
 * */