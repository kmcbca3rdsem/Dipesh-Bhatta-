import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader f = new FileReader("test.txt");
    }

    public static void main(String[] args) throws IOException {
        readFile();
    }
}