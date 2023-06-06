package org.example;

import java.io.*;

/**
 * Запишите в файл следующие строки:
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив
 * (либо HashMap, если студенты с ним знакомы).
 * В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
 * заменить его на соответствующее число.
 * Если на каком-то месте встречается символ,
 * отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        try
        {
            writeFile(readFile("test.txt"), "test1.txt");
        } catch(IOException e)
        {
            e.printStackTrace();
        }

    }

    public static String[][] readFile(String fileName) throws IOException
    {
        int lineCnt = 0;

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while(reader.readLine() != null)
        {
            lineCnt++;
        }
        reader.close();

        reader = new BufferedReader(new FileReader(fileName));
        String[][] result = new String[lineCnt][2];

        for (int i=0; i<lineCnt; i++)
        {
            String[] temp = reader.readLine().split("=");

            if (!temp[1].equals("?"))
            {
                try
                {
                    int a = Integer.parseInt(temp[1]);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    //System.out.println(temp[0]);
                 }
            }
            else
            {
                temp[1] = String.valueOf(temp[0].length());
            }

            result[i][0] = temp[0];
            result[i][1] = temp[1];
        }

        reader.close();

        return result;
    }

    public static void writeFile(String[][] arr,String fileName) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i=0;i<arr.length; i++)
        {
            StringBuilder temp = new StringBuilder(arr[i][0] + "=" + arr[i][1]+"\r");
            writer.write(temp.toString());
        }
        writer.close();

    }
}