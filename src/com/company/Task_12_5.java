package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_12_5 {
    public static void main(String[] args) {
        int countRows = 5;
        int countColumns = 12;
        int mas[][] = new int[countRows][countColumns];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int userString;
        int userColumn;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                mas[i][j] = random.nextInt(99) + 1;
            }
        }

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                System.out.printf("%-5d", mas[i][j]);

            }
            System.out.println();

        }

        System.out.println("--------------------");

        System.out.print("Введите номер строки от 1 до "+countRows+ " для её вывода: ");
        userString = input.nextInt()-1;

        for (int j = 0; j < countColumns; j++) {
            System.out.printf("%-5d", mas[userString][j]);

        }
        System.out.println();

        System.out.println("--------------------");

        System.out.print("Введите номер столбца от 1 до "+countColumns+ " для его вывода: ");
        userColumn = input.nextInt()-1;

        for (int j = 0; j < countRows; j++) {
            System.out.printf("%-5d", mas[j][userColumn]);
            System.out.println();
        }


        }

    }


