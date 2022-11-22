package basics.operators;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        double n1, n2, average;

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the n1:");
        n1 = scan.nextDouble();
        System.out.println("Type the n2:");
        n2 = scan.nextDouble();

        average = ((n1 + n2) / 2);

        if (average <= 4.9) {
            System.out.println("Disapproved!");
        }
        if ((average >= 5.00) && (average <= 6.9)) {
            System.out.println("Recovery!");
        }

        if (average >= 7.0) {
            System.out.println("Aproved!");
        }


    }
}

