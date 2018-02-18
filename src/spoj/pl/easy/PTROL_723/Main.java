package spoj.pl.easy.PTROL_723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int length, tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            length = Integer.parseInt(stringTokenizer.nextToken());
            String answer = "", temp = stringTokenizer.nextToken().toString();

            while (length-- > 1) {
                answer = answer + stringTokenizer.nextToken().toString() + " ";
            }

            answer += temp;
            System.out.println(answer);
        }
    }
}