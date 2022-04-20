package HandlingExceptions;

public class DifferentExceptionsMethods {

    public static void main(String [] args){

        double[] prices ={5.90,6.70,8.78,75.90,95.89};

        int index = 5;

        System.out.println("Start the program\n");
        try
        {
            System.out.format("\nThe price of index %d is %f\n",index, prices[index]);
        }
        catch (Exception e)
        {
            System.out.println("An Exception Occurred");

            System.out.println("An Exception Class: " +e.getClass());
            System.out.println("An Exception message: " +e.getMessage());
            System.out.println("An Exception localized message: " +e.getLocalizedMessage());
            System.out.println("An Exception cause : " +e.getCause());

            System.out.println("\nIs e an Object? " + (e instanceof Object));
            System.out.println("Is e an Throwable? " + (e instanceof Throwable));
            System.out.println("Is e an Exception? " + (e instanceof Exception));
            System.out.println("Is e an RuntimeException? " + (e instanceof RuntimeException));
            System.out.println("Is e an ArrayIndexOutOfBoundsException? " + (e instanceof ArrayIndexOutOfBoundsException));

            System.out.println("\nIs e an ArithmeticException? " + (e instanceof ArithmeticException));
            System.out.println("Is e an StringIndexOutOfBoundsException? " + (e instanceof StringIndexOutOfBoundsException));


        }

        System.out.println("\nEnd of the Program");


    }
}
