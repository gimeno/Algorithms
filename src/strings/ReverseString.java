package strings;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Reverse abc -> " + reverseString("abc"));
        System.out.println("Reverse mnb -> " + reverseString("mnb"));
    }

    private static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();
    }
}
