package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task8_14 {
    public static void main(String[] args) {
        int countRows = 15;
        int countColumns = 3;
        int mas[][] = new int[countRows][countColumns];
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int countWithoutBadMark = 0;
        int userString;
        int userColumn;
        int countSubject = 0;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                mas[i][j] = random.nextInt(5) + 1;
            }
        }

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countColumns; j++) {
                System.out.printf("%-5d", mas[i][j]);

            }
            System.out.println();

        }

        for (int i = 0; i < countColumns; i++) {
            for (int j = 0; j < countRows; j++) {
                if(mas[i][j]!=2)
                {
                    countWithoutBadMark++;
                }
                if(mas[i][j]>3){
                    countSubject++;

                }

            }


        }
        System.out.println("Без двоек сдало"+countWithoutBadMark+"студентов");
        System.out.println("Предметов на 4 и 5 сдало"+countSubject);


    }
}
