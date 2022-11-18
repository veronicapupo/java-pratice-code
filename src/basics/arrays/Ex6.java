package basics.arrays;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Rent[] v = new Rent[10];

        System.out.print("How many rooms will be rented:");
        int n = scan.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next();
            System.out.println("Room: ");
            int number = scan.nextInt();;

            v[number] = new Rent(name, email);

        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10 ; i++) {
            if(v[i] != null){
                System.out.println(i + ":" + v[i]);
            }

        }
    }
}
