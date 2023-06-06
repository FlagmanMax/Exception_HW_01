package org.example.lesson2;

public class hw_task2 {

    /**
     * Task 2
     * Если необходимо, исправьте данный код
     */
    public static void task2()
    {
        int[] intArray = {1,2,3,4,5,6,7,8,10}; // Added array

        try
        {
            int d = 0;
            double сaughtRes1 = intArray[8] / d;
            System.out.println("coughtRes1 = " + сaughtRes1);
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) // Added ArrayIndexOutOfBoundsException
        {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void main(String[] args)
    {
        task2();
    }
}
