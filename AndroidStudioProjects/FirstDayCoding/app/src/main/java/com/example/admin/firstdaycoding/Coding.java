package com.example.admin.firstdaycoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Admin on 3/20/2018.
 */

public class Coding {


    public static void main(String[] args)
    {
        List<String> strings = Arrays.asList("a", "f", "b", "c", "a", "f");

        System.out.println("findDuplicates Strings: ");
        findDuplicates(strings);

        System.out.println("findDuplicates chars: ");
        findDuplicatesChars("happybirthday");

        printFizzBuzz();
    }

    public static void findDuplicates(List<String> strings)
    {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < strings.size(); i++)
            for (int j = i + 1; j < strings.size(); j++)
                if (strings.get(i).equals(strings.get(j)) && !result.contains(strings.get(i)))
                    result.add(strings.get(i));
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }

    public static void findDuplicatesChars(String string)
    {
        ArrayList<Character> result = new ArrayList<Character>();
        for (int i = 0; i < string.length(); i++)
            for (int j = i + 1; j < string.length(); j++)
                if (string.charAt(i) == string.charAt(j) && !result.contains(string.charAt(i)))
                    result.add(string.charAt(i));
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));
    }

    public static void printFizzBuzz()
    {
        for (int i = 0; i < 20; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + ": Fuzz Buzz");
            else if (i % 3 == 0)
                System.out.println(i + ": Fuzz");
            else if (i % 5 == 0)
                System.out.println(i + ": Buzz");

            else
                System.out.println(i + ": ");
        }
    }
}
