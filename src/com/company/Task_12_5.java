package com.company;

import java.util.Random;

public class Task_12_5 {
    public static void main(String[] args) {
        int countRows = 5;
        int countColumns = 12;
        int mas[][] = new int[countRows][countColumns];
        Random random = new Random();

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                mas[countRows][countColumns] = random.nextInt(99) + 1;
            }
            System.out.println();
        }

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                System.out.printf("%-5d", mas[countRows][countColumns]);

            }
            System.out.println();

        }
    }
}
