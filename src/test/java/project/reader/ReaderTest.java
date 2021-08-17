package project.reader;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

    private ByteArrayOutputStream output;
    private PrintStream old;

    private String getOneLineVariation(String s) {
        return s.replaceAll("\n", "");
    }

    @BeforeEach
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(old);
    }

    @Test
    void getTheResultOfCommandExecution_1() {
        Reader reader = new Reader(getOneLineVariation("++++++++" +
                "[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.++++" +
                "+++..+++.>>.<-.<.+++.------.--------.>>+.>++."));
        reader.getTheResultOfCommandExecution();
        assertEquals("Hello World!\n", output.toString());
    }

    @Test
    void getTheResultOfCommandExecution_2() {
        Reader reader = new Reader(getOneLineVariation("+[>[<->+" +
                "[>+++>[+++++++++++>][]-[<]>-]]++++++++++<]>>>>>" +
                ">----.<<+++.<-..+++.<-.>>>.<<.+++.------.>-.<<+.<."));
        reader.getTheResultOfCommandExecution();
        assertEquals("Hello World!\n", output.toString());
    }

    @Test
    void getTheResultOfCommandExecution_3() {
        Reader reader = new Reader(getOneLineVariation(">++++++++" +
                "[-<+++++++++>]<.>>+>-[+]++>++>+++[>[->+++<<+++>]<<]>-" +
                "----.>->+++..+++.>-.<<+[>[+>+]>>]<--------------.>>.+" +
                "++.------.--------.>+.>+."));
        reader.getTheResultOfCommandExecution();
        assertEquals("Hello World!\n", output.toString());
    }

    @Test
    void getTheResultOfCommandExecution_4() {
        Reader reader = new Reader(getOneLineVariation("+++++++++[>+++++++>+++>+<<<-]>+>-[-<+.>]>+."));
        reader.getTheResultOfCommandExecution();
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ\n", output.toString());
    }



}