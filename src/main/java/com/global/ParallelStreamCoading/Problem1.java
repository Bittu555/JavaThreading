package com.global.ParallelStreamCoading;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class Problem1 {
	public static void main(String[] args) throws InterruptedException {
	Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    AtomicBoolean isPaused = new AtomicBoolean(false);
    AtomicBoolean isStopped = new AtomicBoolean(false);
    AtomicBoolean isLoopStopped = new AtomicBoolean(false);

    while (!isLoopStopped.get()) {
        System.out.println("Enter option (1 - Start, 2 - Pause, 3 - Stop, 4 - Status, 5 - Stop Loop):");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                long startTime = System.currentTimeMillis();
                long timeout = 50000; // 5 seconds
                
                    System.out.println("Starting random number generation...");
                    
                    Stream.generate(random::nextInt).limit(timeout).forEach(System.out::println);
                   
                    if (System.currentTimeMillis() - startTime > timeout) {
                        break;
                        
                       
                    }
                
                break;

            case 2:
                System.out.println("Pausing random number generation...");
                isPaused.set(true);
                break;

            case 3:
                System.out.println("Stopping random number generation...");
                isStopped.set(true);
                break;

            case 4:
                System.out.println("Status: " + (isPaused.get() ? "Paused" : "Running"));
                break;
                
            case 5:
                System.out.println("Stopping the loop...");
                isLoopStopped.set(true);
                break;

            default:
                System.out.println("Invalid option, please try again.");
                break;
        }
        
        
        
    }
    
    
    scanner.close();
}
}
