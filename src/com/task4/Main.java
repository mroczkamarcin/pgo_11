package com.task4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number");
        int number = scanner.nextInt();
        fillArray(number, intArray);



    }

    public static int readNumber(int number) throws NegativeNumberException {

        if (number<0){
            throw new NegativeNumberException("Negative numbers are not allowed");

        }else
            return number;

    }

    public static void fillArray(int number, int arr[]){

        for (int i : arr)
            if (readNumber(number)<0){
                arr[i]=0;
        } else {
               arr[i]=readNumber(number);
        }



    }




}
