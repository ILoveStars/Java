package com.company;

import java.util.Scanner;

class WorkMethods {
    public static double StringCalculator (String input) {
        String numbers[] = input.split("[0-9]+");
        String actions[] = input.split("[+-/*//]");

        double result = Double.parseDouble(actions[0]);
        for(int i = 1; i < actions.length; i++){

            if (numbers[i].equals("+"))
                result += Integer.parseInt(actions[i]);
            else if (numbers[i].equals("*"))
                result *= Integer.parseInt(actions[i]);
            else if (numbers[i].equals("/"))
                result /= Integer.parseInt(actions[i]);
            else
                result -= Integer.parseInt(actions[i]);
        }
        return result;
    }

    public static int[] ArraySymmetricFill(int n) {
        int[] array = new int[n];

        int center = (int) Math.ceil((double)n / 2) - 1;
        array[center] = 0;

        int left = center - 1;
        int right = center + 1;

        for(int i = 1; i < (n % 2 == 0 ? center + 2: center + 1); i++) {
            if(i < center + 1)
                array[left--] = i;
            array[right++] = i;
        }
        return array;
    }
}

class RowNames {
    static String row = "";

    public static void RowAdd(String value){
        row += value + " ";
    }

    public static void RowRemove(String value){
        if(row.contains(value)){
            row = row.replace(value, "").trim();
        }
        else{
            System.out.println("There is no such value to remove");
        }
    }

    public static void RowShow(){
        System.out.println(row.trim());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please, enter number of elements in your array");
        String number = in.nextLine();
        int[] arr = WorkMethods.ArraySymmetricFill(Integer.parseInt(number));

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        System.out.println("Please, enter sequence of mathematic actions");
        String input = in.nextLine();
        System.out.println(WorkMethods.StringCalculator(input));

        System.out.println();

        boolean run = true;
        while(run){
            System.out.println("Please, choose further option:");
            System.out.println("1 - Input new string value");
            System.out.println("2 - Output the whole row");
            System.out.println("0 - Exit program");
            String choice = in.nextLine();
            switch (Integer.parseInt(choice)) {
                case 1:
                    String value = in.nextLine();
                    if(value.contains("+")) {
                        value = value.replace("+", "");
                        RowNames.RowAdd(value);
                    }
                    else if(value.contains("-")) {
                        value = value.replace("-", "");
                        RowNames.RowRemove(value);
                    }
                    break;
                case 2:
                    RowNames.RowShow();
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}