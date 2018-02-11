package spoj.pl._438;
//prime numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt();
        int numbers[] = new int [tests];

        for (int i = 0; i<tests; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i:numbers) {
            //code for prime test
            System.out.println(i);
        }
    }
}
