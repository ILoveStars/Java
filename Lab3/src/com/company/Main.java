package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class WorkMethods{
    public static void ListSort(List<String> mylist) {
        mylist.stream().filter(s -> s.startsWith("c")).sorted().forEach(s -> System.out.print(s.toUpperCase() + " "));
    }

    public static void ArrayAvg(int n) {
        Integer[] arr = new Integer[n];
        List<Integer> nums = Arrays.asList(arr);
        Random random = new Random();
        System.out.println(nums.stream().mapToInt(i -> random.nextInt(10)).filter(i -> i % 2 == 0).average()
                .getAsDouble());
    }

    public static void StringSort(String str) {
        str = Pattern.compile("").splitAsStream(str)
                .map(s -> (s.charAt(0) >= 'h' && s.charAt(0) <= 't') ? s.toUpperCase(): s).collect(Collectors.joining());
        System.out.println(str);
    }
}

public class Main {

    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
        System.out.println("Sorted list:");
        WorkMethods.ListSort(mylist);

        System.out.println("\n\nAvg of all odd numbers in random array:");
        WorkMethods.ArrayAvg(12);

        String letters = "sjdhgfsjkavchjwagehf";
        System.out.println("\nSorted string:");
        WorkMethods.StringSort(letters);
    }
}