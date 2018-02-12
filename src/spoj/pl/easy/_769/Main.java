package spoj.pl.easy._769;
//test exercise

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s;
        s = in.readLine();
        int a = Integer.parseInt(s);
        s = in.readLine();
        int b = Integer.parseInt(s);
        System.out.println(a + b);

//        Scanner scanner = new Scanner(System.in);
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        System.out.println(a+b);
    }
}
