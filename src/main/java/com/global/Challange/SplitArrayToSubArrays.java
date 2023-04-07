package com.global.Challange;

import java.util.*;
import java.util.stream.*;


public class SplitArrayToSubArrays{
    
    public static void main(String args[]) {
        int[] inputArray = {78, 99, 12, 100, 45, 73, 33};

        	//{57, 44, 92, 61, 80, 49, 100, 28, 4};
        int chunkSize = 2;
        int p=0;
        int[][] output = splitArray(inputArray, chunkSize);
        for (int[] x : output) {
        	//System.out.println(x[0]+x[x.length-1]);
        	p=p+(x[0]+x[x.length-1]);
        	
        }
        System.out.println(p);
        
    
//  for(int i=0;i<3;i++) {20 5
       // 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99
        //Output
        //991

//	  sum=output[i]+
//  }
        
    }
    
    public static int[][] splitArray(int[] inputArray, int chunkSize) {
        return IntStream.iterate(0, i -> i + chunkSize)
                .limit((int) Math.ceil((double) inputArray.length / chunkSize))
                .mapToObj(j -> Arrays.copyOfRange(inputArray, j, Math.min(inputArray.length, j + chunkSize)))
                .toArray(int[][]::new);
    }
}
