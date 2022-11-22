package basics.arrays;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What number of people: ");
        int n = scan.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Data from " + (i + 1) + " person:");
            System.out.println("Name: ");
            name[i] = scan.next();
            System.out.println("Age: ");
            age[i] = scan.nextInt();
            System.out.println("Height: ");
            height[i] = scan.nextDouble();

        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum = sum + height[i];
        }

        double mediaHeight = sum / n;
        System.out.printf("Media Height: %.2f%n ", mediaHeight);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                count = count + 1;
            }
        }

        double percent = count * 100.0 / n;
        System.out.printf("People under 16 years old: %.1f%%%n", percent);

        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }
    }
}
