package org.example.lesson2;

import java.util.Scanner;

public class hw_task1
{
    /**
     * Task 1
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static float getFloat()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число типа float");

        float value = 0;
        try
        {
            value = in.nextFloat();
        }
        catch (Exception e)
        {
            System.out.println("Ошибка ввода. Попробуйте еще раз");
            value = getFloat();
        }

        return value;
    }

    public static void main(String[] args)
    {
        float value = getFloat();
        System.out.println("Вы ввели число " + value);
    }
}
