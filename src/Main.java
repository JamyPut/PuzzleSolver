import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String puzzle = "oppfjvbikhtygrngpdmfaixoandtfzdvlnnto";

        for (int i = 0; i < 32; i++) {
            System.out.printf("Using value %d in the Caesar cipher\n", i);

            StringBuilder decodedMessage = new StringBuilder();
            for (char c : puzzle.toCharArray()) {
                char decodedChar = (char) (c - i);
                decodedMessage.append(decodedChar);
            }

            System.out.println("Decoded message: " + decodedMessage.toString());
        }
    }
}