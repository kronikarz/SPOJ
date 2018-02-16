package spoj.pl.easy.SUMA_968;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int suma = 0, i = 10;

        while (i-- > 0) {
            System.out.println(suma += Integer.parseInt(string));
            string = bufferedReader.readLine();
        }

//        while (!string.isEmpty() && !string.equals(" ")) {
//                System.out.println(suma += Integer.parseInt(string));
//                string = bufferedReader.readLine();
//        }
    }
}