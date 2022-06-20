public class reducestring {
    public static void main(String[] args) {
        String input = "Jefferson"; // input string
        String firstFourChars = ""; // substring containing first 4 characters

        if (input.length() > 1) {
            firstFourChars = input.substring(0, 1);
        } else {
            firstFourChars = input;
        }

        System.out.println(firstFourChars);
    }
}
