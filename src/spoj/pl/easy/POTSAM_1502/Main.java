package spoj.pl.easy.POTSAM_1502;
//Samolot

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n1 = Integer.parseInt(stringTokenizer.nextToken()),
                k1 = Integer.parseInt(stringTokenizer.nextToken()),
                n2 = Integer.parseInt(stringTokenizer.nextToken()),
                k2 = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(n1 * k1 + n2 * k2);
    }
}