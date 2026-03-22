public class Part3 {

    //Task 8: Check Digits in String
    public static String isAllDigits(String s) {

        if (s.isEmpty()) {
            return "Yes";
        }

        if (!Character.isDigit(s.charAt(0))) {
            return "No";
        }

        return isAllDigits(s.substring(1));
    }

    //Task 9: Count Characters in a String
    public static int countChars(String s) {

        if (s.isEmpty()) {
            return 0;
        }


        return 1 + countChars(s.substring(1));
    }

    //Task 10: Greatest Common Divisor (GCD)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}
