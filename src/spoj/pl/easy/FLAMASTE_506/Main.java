//flamaster
package spoj.pl.easy.FLAMASTE_506;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb;
        String string;
        int tests = Integer.parseInt(br.readLine()), length, index, repeats;
        Character c;

        while (tests-- > 0) {
            sb = new StringBuilder();
            string = br.readLine();
            length = string.length();
            repeats = 1;

            for (index = 0; index < length; index++) {
                if (index >= 1) {
                    c = string.charAt(index - 1);
                    if (!c.equals(string.charAt(index))) {
                        if (repeats == 2) {
                            sb.append(c);
                            repeats = 1;
                        } else if (repeats > 2) {
                            sb.append(repeats);
                            repeats = 1;
                        }
                        sb.append(string.charAt(index));
                    } else {
                        repeats++;
                    }
                } else // index < 1
                    sb.append(string.charAt(index));
            }
            if (repeats == 2) {
                sb.append(string.charAt(length-1));
            } else if (repeats > 2) {
                sb.append(repeats);
            }
            System.out.println(sb.toString());
        }
    }
}