package spoj.en.classical.PRIME1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {
            st = new StringTokenizer(bufferedReader.readLine());
            int numberStart = Integer.parseInt(st.nextToken()),
                    numberEnd = Integer.parseInt(st.nextToken());

            for (; numberStart <= numberEnd; numberStart++) {
                if (numberStart == 2 || numberStart == 3 || numberStart == 5 || numberStart == 7 || numberStart == 11)
                    System.out.println(numberStart);
                else if (numberStart < 2 || numberStart % 2 == 0 || numberStart % 3 == 0 || numberStart % 5 == 0 || numberStart % 7 == 0 || numberStart % 11 == 0);
                else {
                    boolean prime = true;
                    for (int i = 2; i * i <= numberStart; i++) {
                        if (numberStart % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime)
                        System.out.println(numberStart);
                }
            }
            System.out.println();
        }
    }
}