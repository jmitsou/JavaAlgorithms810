package com.company;

import java.util.Arrays;

public class ArrayOfMultiples {

    public static int[] arrayOfMultiples(int num, int length) {

        int[] multiArray = new int[length];

        for (int i = 1; i < length ; i++) {

            multiArray[i] = i * num;
        }
        System.out.println(Arrays.toString(multiArray));
        return multiArray;
    }

    public void run (){
        ArrayOfMultiples.arrayOfMultiples(10,12);
    }

}
