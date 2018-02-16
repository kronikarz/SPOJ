package spoj.pl.easy.KC001_1828;
//Dodawanie liczb calkowitych

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
