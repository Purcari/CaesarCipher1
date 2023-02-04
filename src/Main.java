import java.lang.constant.Constable;

public class Main {

    public static void main(String[] args) {
        System.out.println(encrypt("wearetesting", 2));
    }

    public static String encrypt (String weareTesting, int shiftKey) {
        weareTesting = weareTesting.toLowerCase();
        String cipherText = "";
        for (int i = 0; i< weareTesting.length(); i++) {
            int charPosition = weareTesting.charAt(i) - 'a';
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = (char) (keyVal + 'a');
            cipherText += replaceVal;
        }
        return cipherText;


    }
}




    
