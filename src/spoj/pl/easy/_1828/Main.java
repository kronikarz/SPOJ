package spoj.pl.easy._1828;
//summation of 3 integers

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();

        System.out.println(sum);
    }
}
