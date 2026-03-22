public class Part1 {

    // Task 1: Print Digits
    public static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2: Average (Sum part)
    public static double sumElements(int[] arr, int n) {
        if (n <= 0) return 0;
        return sumElements(arr, n - 1) + arr[n - 1];
    }

    // Task 3: Prime Number Check
    public static String isPrime(int n, int d) {
        if (n <= 1) return "Composite";
        if (n == 2) return "Prime";
        if (n % d == 0) return "Composite";
        if (d * d > n) return "Prime";

        return isPrime(n, d + 1);
    }

    // Task 4: Factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }


    public static double getAverage(int[] arr) {
        if (arr.length == 0) return 0;
        return sumElements(arr, arr.length) / (double) arr.length;
    }
}
