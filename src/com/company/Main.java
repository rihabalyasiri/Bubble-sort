package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] notSortedArray = new int[5];

    public static void main(String[] args) {
        getInteger();
        printArray(sortIntegers(notSortedArray));
    }

    public static void getInteger() {
        System.out.println("Please enter 5 values for the array: \n");
        for (int i = 0; i < notSortedArray.length; i++) {
            notSortedArray[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        //for-each loop of array
        for (int i:array) {
            System.out.print(i + " ");
        }
    }


    public static int[] sortIntegers(int[] array) {
        //bubble sort algorithmus
        int temp;
        for(int i =1; i< array.length ; i++) {
            for(int j =0; j< array.length -i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
}

