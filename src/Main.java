public class Main {
    public static void main(String[] args) {
        String puzzle = "oppfjvbikhtygrngpdmfaixoandtfzdvlnnto";

        // Assuming the string is a simple substitution cipher, we can decode it by shifting each character 2 positions back in the alphabet
        StringBuilder decodedMessage = new StringBuilder();
        for (char c : puzzle.toCharArray()) {
            char decodedChar = (char) (c - 2);
            decodedMessage.append(decodedChar);
        }

        System.out.println("Decoded message: " + decodedMessage.toString());
    }
}