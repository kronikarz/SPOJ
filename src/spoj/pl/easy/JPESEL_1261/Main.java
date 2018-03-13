//pesel
package spoj.pl.easy.JPESEL_1261;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(br.readLine());
        long number;
        int array[] = new int[11];

        while (tests-- > 0) {
            number = Long.parseLong(br.readLine());

            for (int i = 0; i < 11; i++) {
                array[i] = (int) (number % 10);
                number /= 10;
            }

            number = array[10] + array[9] * 3 + array[8] * 7 + array[7] * 9 + array[6] + array[5] * 3 + array[4] * 7 + array[3] * 9 + array[2] + array[1] * 3 + array[0];

            if (number <= 0)
                System.out.println("N");
            else if (number % 10 == 0)
                System.out.println("D");
            else
                System.out.println("N");
        }
    }
}