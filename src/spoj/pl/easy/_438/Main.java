package spoj.pl.easy._438;
//prime numbers

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int tests = scanner.nextInt();
        String answer[] = new String[tests];

        for (int i = 0; i < tests; i++) {

            number = scanner.nextInt();

            if (number < 2)
                answer[i] = "NIE";
            else if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11)
                answer[i] = "TAK";
            else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 11 == 0)
                answer[i] = "NIE";
            else {
                for (int j = 2; j * j <= number; j++) {
                    if (number % j == 0) {
                        answer[i] = "NIE";
                        break;
                    } else
                        answer[i] = "TAK";
                }
            }
        }

        for (String i : answer)
            System.out.println(i);
    }
}

