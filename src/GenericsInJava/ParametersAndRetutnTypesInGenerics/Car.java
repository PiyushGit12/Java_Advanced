package GenericsInJava.ParametersAndRetutnTypesInGenerics;

// Generic Class with Custom type

public class Car {

    public String make;
    public String model;
    public int price;

    public Car(String make, String  model, int price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("{Make: %s, Model: %s, Price: %s}", make,model,price);
    }



}


/*

1- Now we have defined this custom class Car.We can now have a Repository hold Objects of type Car.





* */