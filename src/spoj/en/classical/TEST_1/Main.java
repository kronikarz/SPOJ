package spoj.en.classical.TEST_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number;
        while (!(number = br.readLine()).equals("42"))
            System.out.println(number);
    }
}