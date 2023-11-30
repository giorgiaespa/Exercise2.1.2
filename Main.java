import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        char aChar = (char) (r.nextInt(97, 122));
        try {
            isInt(aChar);
            System.out.println(aChar + " è un numero? " + false);
        } catch (Exception e) {
            System.out.println(aChar + " non è un mumero. " + e);
        }
    }

    public static void isInt(char aChar) throws Exception {
        if (Character.isDigit(aChar)) {
            System.out.println(aChar);
        } else throw new Exception();
    }
}