package spoj.pl.easy.PP0502B_606;
//Reverse Array

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int tests = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer input;

        while (tests-- > 0) {
            input = new StringTokenizer(bufferedReader.readLine());
            int arrayLength = Integer.parseInt(input.nextToken()),
                    reverseArray[] = new int[arrayLength];

            while (arrayLength-- > 0)
                reverseArray[arrayLength] = Integer.parseInt(input.nextToken());

            while (arrayLength++ < reverseArray.length - 1)
                System.out.print(reverseArray[arrayLength] + " ");

            System.out.println();
        }
    }
}