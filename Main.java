public class Main {
    public static void main(String[] args) {

        String str = "aaabbccccd";
        String result = "";

        int i = 0;

        while (i < str.length()) {

            char ch = str.charAt(i);
            int count = 0;

            while (i < str.length() && str.charAt(i) == ch) {
                count++;
                i++;
            }

            result = result + ch;

            if (count > 1) {
                result = result + count;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("Compressed String: " + result);
    }
}