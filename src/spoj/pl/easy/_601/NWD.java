package spoj.pl.easy._601;
//NWD - najwiekszy wspolny dzielnik
//GCD - greatest common divisor
//Euklides Algorithm


import java.util.Scanner;

public class NWD {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tests = scanner.nextInt(), answer[] = new int[tests];

        for (int i = 0; i < tests; i++) {

            int temp, a = scanner.nextInt(), b = scanner.nextInt();

            while (b != 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            answer[i] = a;
        }

        for (int i : answer)
            System.out.println(i);
    }
}
