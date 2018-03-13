//parzyste, nieparzyste
package spoj.pl.easy.PP0602A_1055;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int tests = Integer.parseInt(br.readLine());

        while (tests-- > 0) {
            st = new StringTokenizer(br.readLine());
            int length = Integer.parseInt(st.nextToken()), array[] = new int[length];

            System.out.println();

            for (int i = 0; i < length; i++) {
                array[i] = Integer.parseInt(st.nextToken());
                if (i % 2 == 1) {
                    System.out.print(array[i] + " ");
                }
            }

            for (int i = 0; i < length; i=i+2) {
                System.out.print(array[i] + " ");
            }
        }
    }
}