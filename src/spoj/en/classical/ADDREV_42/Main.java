package spoj.en.classical.ADDREV_42;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tests = Integer.parseInt(br.readLine()), a, b;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        while (tests-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            while (a > 0 || b > 0) {
                if (a > 0) {
                    sb1.append(a % 10);
                    a /= 10;
                }
                if (b > 0) {
                    sb2.append(b % 10);
                    b /= 10;
                }
            }
            a = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());

            while (a > 0) {
                sb1.append(a % 10);
                a /= 10;
            }
            System.out.println(Integer.parseInt(sb1.toString()));
            sb1.delete(0, sb1.length());
        }
    }
}