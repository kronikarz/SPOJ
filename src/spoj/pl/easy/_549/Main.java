package spoj.pl.easy._549;
//simple addition

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        int sum[] = new int[test];
        int i;

        for (i = 0; i < test; i++) {

            int numbersAmmount = scanner.nextInt();

            for(int j = 1; j <= numbersAmmount; j++)
                sum[i] += scanner.nextInt();
        }

        for(i=0; i< test; i++)
            System.out.println(sum[i]);
    }
}
