package HandlingExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExploringExceptions {

     public static void main(String [] args) throws FileNotFoundException {


//         String my_String[] = {"Hello","Java", null, "program"};
//
//         for(String str: my_String){
//
//             System.out.format("The String %s has a Length of  %d\n",str.toUpperCase(),str.length());
//         }

       try {
             FileReader file = new FileReader("C:/Users/piyush.sonkar/IdeaProjects/Learning_Java/sampleFile.txt");
            }
         catch (FileNotFoundException e)
         {
             System.out.println("\nThe file was not found.Create SampleFle.txt and re-run");
          }
       System.out.println("The code Execution is complete");

     }
}
