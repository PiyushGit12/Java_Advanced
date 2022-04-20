package HandlingExceptions;

public class HandlingExceptions {

    public static void main(String [] args){


        double[] prices ={5.90,6.70,8.78,75.90};

        int index = 4;

        System.out.println("Start the program");
        try
        {
            System.out.format("\nThe price of index %d is %f\n",index, prices[index]);
            System.out.println("This does not run if there is an Exception");
        }
        catch (Exception e)
        {
           System.out.println("An exception occurred");

           System.out.println(e);
//           e.printStackTrace();
        }

        System.out.println("End of the Program");


    }
}


/* 1- So this System.out.println(e); statement tells us the String representation of our exception object.
*  2-  e.printStackTrace();  :- The stack trace allows us to identify the root cause of the error.
*  3-  So even if you have a multiple lines within your try block and not just two if an exception occurs during the execution,
       any lines occurring  after it will be ignored,and code execution moved over to the catch block.   */