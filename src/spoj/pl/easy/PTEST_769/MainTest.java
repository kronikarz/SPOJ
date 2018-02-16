package spoj.pl.easy.PTEST_769;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

public class MainTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errorStream = new ByteArrayOutputStream();
    private ByteArrayInputStream inputStream;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setErr(new PrintStream(errorStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
        System.setIn(System.in);
    }

    @Test
    void main() throws IOException {

        Main main = new Main();

        String number = "1\n2\n";
        inputStream = new ByteArrayInputStream(number.getBytes());
        System.setIn(inputStream);

        main.main();

        assertEquals("test\n3\n", outputStream.toString());
//        fail("test not implemented");
    }
}