package basics.arrays;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;

        System.out.println("Average Price: " + avg);
    }
}
