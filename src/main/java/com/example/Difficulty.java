package com.example;

import java.util.Scanner;

public class Difficulty {
    public void selectLevel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Easy level selected");
                break;
            case 2:
                System.out.println("Medium level selected");
                break;
            case 3:
                System.out.println("Hard level selected");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        
        scanner.close();
    }
}