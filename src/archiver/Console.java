package archiver;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
    private static BufferedReader bF = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws Exception {
        String text = bF.readLine();
        return text;
    }

    public static int readInt() throws Exception {
        String text = readString();
        return Integer.parseInt(text);
    }
}
