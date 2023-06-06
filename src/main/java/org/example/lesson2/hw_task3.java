package org.example.lesson2;

public class hw_task3
{
    /**
     * Task 3
     * Дан следующий код, исправьте его там, где требуется
     */
    public static void main(String[] args) throws Exception
    {
        try
        {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        }
        catch (NullPointerException ex)
        {
            System.out.println("Указатель не может указывать на null!");
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable ex)                                            // Moved to bottom to check other Exceptions first
        {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b)                   // No need for 'FileNotFoundException'
    {
        System.out.println(a + b);
    }

}
