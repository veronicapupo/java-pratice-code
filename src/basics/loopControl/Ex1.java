package basics.loopControl;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int sum = 0;
        int min = 0;
        int average = 0;
        int quantityEven = 0;
        int answer = 0;
        int old = 0;
        int count = 0;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = scan.nextInt();
            if (count == 0){
                old = number;
            }
            count++;

            //validate min value
            if (number < old) {
                min = number;
            }


            // increase total  sum
            sum += number;

            //validate how many even number
            if (number % 2 == 0) {
                quantityEven++;
            }

            // average of values
            average = sum / count;

            System.out.println("continue? \n1 -yes \n2- no");
            answer = scan.nextInt();


            old = number;
        }
        while (answer == 1);
        {
            System.out.println("\n The sum of the numbers is: " + sum);
            System.out.println("\n The smallest value is: " + min);
            System.out.println("\n The average of the values is: " + average);
            System.out.println("\n Total even numbers: " + quantityEven);
        }
    }
}