package spoj.pl.easy.GLUTTON_626;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int eaters = Integer.parseInt(stringTokenizer.nextToken()),
                    box = Integer.parseInt(stringTokenizer.nextToken()),
                    cookiez = 0;

            while (eaters-- > 0)
                cookiez += 86400 / Integer.parseInt(bufferedReader.readLine());

            System.out.println((int) Math.ceil((double) cookiez / box));
        }
    }
}