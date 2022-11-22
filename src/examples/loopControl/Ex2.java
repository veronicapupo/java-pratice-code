package examples.loopControl;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        int p = 1, genre, genreF = 0;
        float weight, m100 = 0, mF = 0, mWeight = 0, sum = 0;

        Scanner scan = new Scanner(System.in);


        /*for(int i=0; i<3; i++)*/

        while (p < 3) {
            System.out.println("\nWhat is your gender? \n1-Feminine \n2-Masculine");
            genre = scan.nextInt();
            System.out.println("\nWhat's your weight?");
            weight = scan.nextFloat();

            if (genre == 2 && weight > 100) {
                m100++;
                if (weight > weight) {
                    weight = mWeight;
                }

            }
            if (genre == 1) {
                genreF++;
                sum = sum + weight;
                mF = sum / 3;
            }

        }
        p++;


        System.out.println("\n Quantity feminine: " + genreF);
        System.out.println("\n Quantity masculine weight > 100: " + m100);
        System.out.println("\n Average weight among women: " + mF);
        System.out.println("\n The heaviest weight among men: " + mWeight);
    }
}






