package com.company;

class WorkMethods {
    public static int[][] MatrixRandomFill(int n, int m) {
        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 9);
            }
        }
        return array;
    }

    public static void MatrixPrint(int array[][]) {
        System.out.println("The matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void MatrixDiagonalNonOdd(int array[][]) {
        System.out.println("Non-odd elements of the side diagonal:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(i + j == array.length - 1 && array[i][j] % 2 == 0) { System.out.print(array[i][j] + " "); }
            }
        }
    }

    public static int[] ArrayStepsFill(int begin, int end, int step) {
        int array[] = new int[(int)Math.ceil((end - begin) / (double)step)];

        for(int i = 0; i < array.length; i++){
            array[i] = begin;
            begin += step;
        }

        return  array;
    }

    public static void ArrayPrint(int array[]) {
        System.out.println("The array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        int[][] matrix = WorkMethods.MatrixRandomFill(5,5);

        WorkMethods.MatrixPrint(matrix);
        System.out.println();
        WorkMethods.MatrixDiagonalNonOdd(matrix);
        System.out.println("\n");

        int[] array = WorkMethods.ArrayStepsFill(0, 21, 2);

        WorkMethods.ArrayPrint(array);
    }
}