package HandlingExceptions;

import java.io.*;

public class ThrowsKeyword {

    public static void main(String [] args) throws IOException {


        File file = new File("C:/Users/piyush.sonkar/IdeaProjects/JavaExceptionHandling/Exceptions.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st = br.readLine();

        while (st !=null){

            System.out.println(st);
            st = br.readLine();
        }

        br.close();



    }
}
