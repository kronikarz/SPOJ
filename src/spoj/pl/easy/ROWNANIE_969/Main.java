package spoj.pl.easy.ROWNANIE_969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s;
        double a, b, c;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            a = Double.parseDouble(st.nextToken());
            b = Double.parseDouble(st.nextToken());
            c = Double.parseDouble(st.nextToken());

            a = b * b - 4 * a * c;

            if (a > 0)
                System.out.println(2);
            else if (a == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}