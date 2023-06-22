package Cipher;

import java.util.Scanner;

public class CaesarCipher {

    private final String encryptedString;
    Scanner sc = new Scanner(System.in);

    public CaesarCipher(String encryptedString) {
        this.encryptedString = encryptedString;
    }

    public void solve(){
        System.out.println("decoding will start with cypher 0\nEnter a the maximum amount of times the caesar value can be incremented: ...");
        int maxCaesarValue = sc.nextInt();
        System.out.printf("Using encrypted string: %S\n", encryptedString);
        for (int i = 0; i < maxCaesarValue; i++) {
            System.out.printf("Using value %d in the Caesar cipher\n", i);

            StringBuilder decodedMessage = new StringBuilder();
            for (char c : encryptedString.toCharArray()) {
                if (Character.isLetter(c)) {
                    char decodedChar = (char) (c - i);
                    if (decodedChar < 'a') {
                        decodedChar = (char) (decodedChar + 26);
                    }
                    decodedMessage.append(decodedChar);
                } else {
                    decodedMessage.append(c);
                }
            }
            System.out.println("Decoded message: " + decodedMessage.toString());
            sc.close();
        }
    }
}
