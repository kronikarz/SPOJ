package spoj.pl.easy.TABLICA_977;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String s;
        int length;

        while ((s = br.readLine()) != null) {
            st = new StringTokenizer(s);
            length = st.countTokens();
            int array[] = new int[length], i = -1;

            while (++i < length)
                array[i] = Integer.parseInt(st.nextToken());

            System.out.println();
            while (--i != -1)
                System.out.print(array[i] + " ");
        }
    }
}