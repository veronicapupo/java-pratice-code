package examples.arrays;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = scan.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("Average Height: " + avg);
    }
}
