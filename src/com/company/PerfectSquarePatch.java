package com.company;

import java.util.Arrays;

public class PerfectSquarePatch {

    public static int[][] patch(int num) {

        int[][] arraySquare = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arraySquare[i][j] = num;

            }
        }
        System.out.println(Arrays.deepToString(arraySquare));
        return arraySquare;
    }
    public void run (){
        PerfectSquarePatch.patch(10);
    }
}
