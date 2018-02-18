package spoj.pl.easy.PRZEDSZK_522;
//NWW - Najmniejsza wspolna wielokrotnosc
//LCM - Least common multiple

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine()),
                temp;

        StringTokenizer stringTokenizer;

        while (tests-- > 0) {

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken()),
                    b = Integer.parseInt(stringTokenizer.nextToken()),
                    ab = a * b;

            while (b > 0) {
                temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println(ab / a);
        }
    }
}