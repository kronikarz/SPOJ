package spoj.pl.easy._438;
//prime numbers
//square root algorithm

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Prime_T {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {

            boolean prime = false;

            int number = Integer.parseInt(bufferedReader.readLine());

            if (number < 2)
                System.out.println("NIE");
            else if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11)
                System.out.println("TAK");
            else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 11 == 0)
                System.out.println("NIE");
            else {
                prime = true;

                for (int j = 2; j * j <= number; j++) {
                    if (number % j == 0) {
                        System.out.println("NIE");
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.println("TAK");
        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//
//        int number;
//        int tests = scanner.nextInt();
//        String answer[] = new String[tests];
//
//        for (int i = 0; i < tests; i++) {
//
//            number = scanner.nextInt();
//
//            if (number < 2)
//                answer[i] = "NIE";
//            else if (number == 2 || number == 3 || number == 5 || number == 7 || number == 11)
//                answer[i] = "TAK";
//            else if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0 || number % 11 == 0)
//                answer[i] = "NIE";
//            else {
//                for (int j = 2; j * j <= number; j++) {
//                    if (number % j == 0) {
//                        answer[i] = "NIE";
//                        break;
//                    } else
//                        answer[i] = "TAK";
//                }
//            }
//        }
//
//        for (String i : answer)
//            System.out.println(i);
//}

