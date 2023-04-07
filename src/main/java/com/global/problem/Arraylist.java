package com.global.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arraylist {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        Random rand = new Random();

        int numtogen;
      
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to generate: ");
        numtogen = scan.nextInt();
        

        HashSet<Integer> generated = new HashSet<Integer>();

        // Prevent repeat
        for (int x = 1; x <= numtogen; ++x) {
            while (true) {
                // generate a range from 0-100
                int ranNum = rand.nextInt(100);

                if (generated.contains(ranNum)) {
                	if(ranNum%2!=0) {
                		list1.add(ranNum);
                	}

                    continue;
                } else {
                	if(ranNum%2==0) {
                    list.add(ranNum);
                    System.out.println("Number " + x + "=" + " = " + ranNum);
                    break;
                	}
                	
                    
                }

            }

        }
        int numinlist;
        while (!list.isEmpty()) {

           
        }
    }

}