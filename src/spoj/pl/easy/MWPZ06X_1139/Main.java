package spoj.pl.easy.MWPZ06X_1139;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {
            int a = Integer.parseInt(bufferedReader.readLine());
            System.out.println(a * a);
        }
    }
}