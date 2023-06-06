package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lesson1
{
    public static void main(String[] args) throws FileNotFoundException
    {
          // NullPointerException
//        String name = null;
//        System.out.println(name.length());

          // ClassCastexception
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

          // NumberFormatException
//        String number = "123dd";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

//        // UnsupportedOperationException
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());

/*
        int number = 1;
        try
        {
            number = 10 / 1;
            String test = null;
            //System.out.println(test.length());
            Collections.emptyList().add(new Object());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Zero division");
        }
        catch (NullPointerException e)
        {
            System.out.println("Null pointer");
        }
        catch (Exception e)
        {
            System.out.println("Some exception");
        }

        System.out.println(number);
*/
        FileReader test = null;
        try
        {
            test = new FileReader("test_1.txt");
            test.read();
        }
        catch (RuntimeException | IOException e)
        {
            System.out.println("Caught exception: "+ e.getClass().getSimpleName());
        }
        finally
        {
            System.out.println("Finally done");
            if (test != null)
            {
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Close exception");
                }
            };
        }
    }
}
