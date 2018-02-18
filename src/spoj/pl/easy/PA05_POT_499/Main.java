package spoj.pl.easy.PA05_POT_499;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        int tests = Integer.parseInt(bufferedReader.readLine());

        while (tests-- > 0) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = (Integer.parseInt(stringTokenizer.nextToken())) % 10,
                    b = Integer.parseInt(stringTokenizer.nextToken()),
                    tab[] = new int[] {0,0,0,0,1,1,1,1,2,4,8,6,3,9,7,1,4,6,4,6,5,5,5,5,6,6,6,6,7,9,3,1,8,4,2,6,9,1,9,1};

            if (b == 0) {
                System.out.println(1);
                continue;
            }

            System.out.println(tab[(4 * a + ((b - 1) % 4))]);
//
//            switch (a) {
//                case 0:
//                    System.out.println(0);
//                    continue;
//                case 1:
//                    System.out.println(1);
//                    continue;
//                case 2:
//                    switch (b % 4) {
//                        case 0:
//                            System.out.println(6);
//                            continue;
//                        case 1:
//                            System.out.println(2);
//                            continue;
//                        case 2:
//                            System.out.println(4);
//                            continue;
//                        case 3:
//                            System.out.println(8);
//                            continue;
//                    }
//                case 3:
//                    switch (b % 4) {
//                        case 0:
//                            System.out.println(1);
//                            continue;
//                        case 1:
//                            System.out.println(3);
//                            continue;
//                        case 2:
//                            System.out.println(9);
//                            continue;
//                        case 3:
//                            System.out.println(7);
//                            continue;
//                    }
//                case 4:
//                    switch (b % 2) {
//                        case 0:
//                            System.out.println(6);
//                            continue;
//                        case 1:
//                            System.out.println(4);
//                            continue;
//                    }
//                case 5:
//                    System.out.println(5);
//                    continue;
//                case 6:
//                    System.out.println(6);
//                    continue;
//                case 7:
//                    switch (b % 4) {
//                        case 0:
//                            System.out.println(1);
//                            continue;
//                        case 1:
//                            System.out.println(7);
//                            continue;
//                        case 2:
//                            System.out.println(9);
//                            continue;
//                        case 3:
//                            System.out.println(3);
//                            continue;
//                    }
//                case 8:
//                    switch (b % 4) {
//                        case 0:
//                            System.out.println(6);
//                            continue;
//                        case 1:
//                            System.out.println(8);
//                            continue;
//                        case 2:
//                            System.out.println(4);
//                            continue;
//                        case 3:
//                            System.out.println(2);
//                            continue;
//                    }
//                case 9:
//                    switch (b % 2) {
//                        case 0:
//                            System.out.println(1);
//                            continue;
//                        case 1:
//                            System.out.println(9);
//                            continue;
//                    }
//                case 10:
//                    System.out.println(0);
//                    continue;
//            }
        }
    }
}