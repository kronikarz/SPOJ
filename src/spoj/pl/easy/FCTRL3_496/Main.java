package spoj.pl.easy.FCTRL3_496;
//Dwie cyfry silni

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String factorial[] = new String[]{"0 1", "0 1", "0 2", "0 6", "2 4", "2 0", "2 0", "4 0", "2 0", "8 0", "0 0"};
        int tests = scanner.nextInt(), answer[] = new int[tests];

        for (int i = 0; i < tests; i++) {

            int input = scanner.nextInt();

            if (input > 10)
                input = 10;

            answer[i] = input;
        }

        for (int i : answer)
            System.out.println(factorial[i]);
    }
}
