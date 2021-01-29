package com.company;

import java.util.ArrayList;
import java.util.Collections;

class WorkMethods {
    public static int UniqueSearch(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++)
        {
            result ^= array[i];
        }

        return (result > 0 ? result : -1);
    }

    public static int[] ArrayOddsSort(int[] arr) {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                odd.add(arr[i]);
            }
        }

        Collections.sort(odd);

        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 1){
                arr[i] = odd.get(counter++);
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}

public class Main {

    public static void main(String[] args) {
        int[] unique = {7, 2, 1, 1, 2, 4, 7};
        int result = WorkMethods.UniqueSearch(unique);
        System.out.println("Unique number:" + result);

        System.out.println();

        int[] arr = {8, 5, 2, 7, 3, 4};
        System.out.println("Sorted array:");
        arr = WorkMethods.ArrayOddsSort(arr);
    }
}