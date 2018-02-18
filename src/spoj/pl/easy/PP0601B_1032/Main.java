package spoj.pl.easy.PP0601B_1032;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer;

        while (tests-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(stringTokenizer.nextToken()),
                    x = Integer.parseInt(stringTokenizer.nextToken()),
                    y = Integer.parseInt(stringTokenizer.nextToken()),
                    i = 0;
            String answer = "";

            while ((i += x) < n) {
                if (!(i % y == 0))
                    answer = answer + i + " ";
            }
            System.out.println(answer);
        }
    }
}