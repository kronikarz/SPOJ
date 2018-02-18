package spoj.pl.easy.POL_1011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());
        String string;

        while (tests-- > 0) {
            string = bufferedReader.readLine();
            System.out.println(string.substring(0, string.length() / 2));
        }
    }
}