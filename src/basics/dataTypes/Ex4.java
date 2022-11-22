package basics.dataTypes;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Number of cigarettes per day:");
        double cigarretes = scan.nextDouble();
        System.out.println("How old do you smoke:");
        double yearsOld = scan.nextDouble();

        double days = (yearsOld * 365);
        double total = (cigarretes * days);

        double min = days * 1440;
        double lostdays = (total * 10) / 1440;

        System.out.println(" Lost days " + lostdays);
        System.out.println(" Min days " + min);
    }
}
