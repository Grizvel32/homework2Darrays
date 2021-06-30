package com.company;

import java.util.Random;
import java.util.Scanner;




    public class Task12_7 {
        public static void main(String[] args) {
            int countRows = 5;
            int countColumns = 12;
            int mas[][] = new int[countRows][countColumns];
            Random random = new Random();
            Scanner input = new Scanner(System.in);
            int userNumberElement;
            int userNumber;
            int randomColumn;
            int randomRow;

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

            System.out.print("Введите номер элемента для замены от 1 до "+countColumns+ " : ");
            userNumberElement = input.nextInt()-1;

            for (int j = 0; j < countColumns; j++) {
                mas[4][userNumberElement] = 1949;
                System.out.printf("%-5d", mas[4][j]);

            }
            System.out.println();

            System.out.println("--------------------");

            System.out.print("Введите число которым заменится случайный элемент в массиве ");
            userNumber = input.nextInt();
            randomColumn = random.nextInt(countColumns);
            randomRow = random.nextInt(countRows);
            mas[randomRow][randomColumn] = userNumber;

            for (int i = 0; i < countRows; i++) {
                for (int j = 0; j < countColumns; j++) {
                    System.out.printf("%-5d", mas[i][j]);

                }
                System.out.println();

            }


        }

    }


