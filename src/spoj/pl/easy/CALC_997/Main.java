package spoj.pl.easy.CALC_997;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string;

        while ((string = bufferedReader.readLine()) != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(string);
            string = stringTokenizer.nextToken();
            int a = Integer.parseInt(stringTokenizer.nextToken()), b = Integer.parseInt(stringTokenizer.nextToken());

            switch (string) {
                case "+":
                    System.out.println(a + b);
                    continue;
                case "-":
                    System.out.println(a - b);
                    continue;
                case "*":
                    System.out.println(a * b);
                    continue;
                case "/":
                    System.out.println(a / b);
                    continue;
                case "%":
                    System.out.println(a % b);
            }
        }
    }
}