package spoj.pl.easy._1016;
//Predkosc srednia

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VSR {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {

            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int V1 = Integer.parseInt(stringTokenizer.nextToken()), V2 = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println((2 * V1 * V2) / (V1 + V2));
        }

//        Scanner scanner = new Scanner(System.in);
//
//        int tests = scanner.nextInt();
//
//        while (tests-- > 0) {
//
//            int V1 = scanner.nextInt(), V2 = scanner.nextInt();
//
//            System.out.println((2 * V1 * V2) / (V1 + V2));
//        }
    }
}