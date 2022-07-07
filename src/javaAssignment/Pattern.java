    package javaAssignment;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of your triangle");
        int length = scanner.nextInt();

        for (int row = 0; row < length; row++) {
            for (int column = row; column >= 0; column--) {
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println();

        for (int row = length; row > 0; row--) {
            for (int column = row; column > 0; column--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();


        for (int row = 0; row < length; row++) {
            for (int column = row; column > 0; column--) {
                System.out.print("  ");
            }
            for (int column = row; column < length; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 0; row < length; row++) {
            for (int column = length; column > row; column--) {
                System.out.print("  ");
            }
            for (int column = 0; column < row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


//        for(int row = 1; row <= length; row++){
//            for (int column = 1; column <= row; column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    }

    }




