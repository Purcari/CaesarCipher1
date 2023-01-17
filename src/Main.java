import java.lang.constant.Constable;

public class Main {

    public static String encrypt(String weareTesting, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        int shifta = 3;
        for (int i = 0; i < weareTesting.length(); i++) {
            char c = weareTesting.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isLowerCase(c)) {
                    char newC = (char) ((c - 'a' + shift) % 26 + 'a');
                    encryptedText.append(newC);
                } else {
                    char newC = (char) ((c - 'A' + shift) % 26 + 'A');
                    encryptedText.append(newC);
                }
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }
}









    
