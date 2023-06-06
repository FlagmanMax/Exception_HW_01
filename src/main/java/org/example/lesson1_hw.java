package org.example;

import java.io.File;

public class lesson1_hw {

    public void method1_nullPointerException()
    {
        String name = null;
        System.out.println(name.length());
    }

    public void method2_ClassCastexception()
    {
        Object object = new String("123");
        File file = (File) object;
        System.out.println(file);
    }

    public void method3_NumberFormatException()
    {
        String number = "123dd";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }

    public void method4_ArithmeticException()
    {
        int a = 10;
        int b = 0;
        int c = a/b;
    }

    public static int[] difference(int[] arr1, int[] arr2)
    {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        int arr3Len;
        if (arr1Len>= arr2Len)
        {
            arr3Len = arr1Len;
        }
        else
        {
            arr3Len = arr2Len;
        }

        int[] result = new int[arr3Len];

        try
        {
            for (int i=0;i<arr3Len;i++)
            {
                result[i] = arr1[i] - arr2[i];
            }
        }
        catch (Exception e)
        {
            System.out.println("Массивы имеют разную. Exception : " +e.getClass().getSimpleName() );
        }

        return result;
    }

    public static int[] division(int[] arr1, int[] arr2)
    {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        int arr3Len;
        if (arr1Len>= arr2Len)
        {
            arr3Len = arr1Len;
        }
        else
        {
            arr3Len = arr2Len;
        }

        int[] result = new int[arr3Len];

        try
        {
            for (int i=0;i<arr3Len;i++)
            {
                result[i] = arr1[i] / arr2[i];
            }
        }
        catch (RuntimeException e)
        {
            System.out.println("Exception : " +e.getClass().getSimpleName() );
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3,10};
        int[] arr2 = {3,4,5,6,0};

        int[] arr3;

        //arr3 = difference(arr1,arr2);

        arr3 = division(arr1,arr2);

    }

}
