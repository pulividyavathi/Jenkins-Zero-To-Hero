package com.vidya;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;



public class HelloTest {

    @Test
    public void testHelloWorldOutput() {
        // Capture the output of the HelloWorld main method
        // Since we don't have a return value from main, we use System.setOut to capture the print statements

        // Create a stream to capture the output
        java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));

        // Call the main method
        HelloWorld.main(new String[]{});

        // Verify the expected output
        String expectedOutput = "Hello from my custom Java code!\n"; // Include the newline
        assertEquals(expectedOutput, outputStream.toString());
    }
}
