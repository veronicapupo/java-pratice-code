package basics.arrays;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers?");
        int n = scan.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number: ");
            v[i] = scan.nextInt();

        }
        System.out.println("Negative Numbers: ");
        for (int i = 0; i < n; i++) {
            if (v[i] < 0) {
                System.out.println(v[i]);
            }
        }
    }
}
