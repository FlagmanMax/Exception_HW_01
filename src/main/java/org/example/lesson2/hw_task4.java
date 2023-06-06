package org.example.lesson2;

import java.util.Scanner;

public class hw_task4
{
    /**
     * Task 4
     * Разработайте программу, которая выбросит Exception,
     * когда пользователь вводит пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static String getLine()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите не пустую строку");

        String value = in.nextLine();

        if (value.length() == 0)
        {
            throw new RuntimeException("Пустые строки вводить нельзя");
        }

        return value;
    }

    public static void main(String[] args)
    {
        String newLine = getLine();
        System.out.println(newLine);
    }
}
