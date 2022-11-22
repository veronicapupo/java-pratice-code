package basics.operators;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        double imc;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight:");
        double weight = scan.nextDouble();

        System.out.println("Enter your height:");
        double height = scan.nextDouble();

        imc = (weight / (height * height));

        if (imc < 18.5) {
            System.out.println("Under weight");
        }
        if ((imc >= 18.5) && (imc < 25)) {
            System.out.println("Ideal weight");
        }
        if ((imc >= 25) && (imc < 30)) {
            System.out.println("Overweight");
        }
        if ((imc >= 30) && (imc <= 40)) {
            System.out.println("Obesity");
        }
        if (imc > 40) {
            System.out.println("Morbid obesity");
        }
    }
}
