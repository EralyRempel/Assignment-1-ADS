import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- PART 1: NUMBERS ---
        System.out.println("=== PART 1: NUMBERS ===");

        System.out.println("Task 1 (Print Digits of 5481):");
        Part1.printDigits(5481);

        System.out.println("\nTask 2 (Average of [3, 2, 4, 1]):");
        int[] arr1 = {3, 2, 4, 1};
        System.out.println("Average: " + Part1.getAverage(arr1));

        System.out.println("\nTask 3 (Prime Check):");
        System.out.println("Is 7 prime? " + Part1.isPrime(7, 2));
        System.out.println("Is 10 prime? " + Part1.isPrime(10, 2));

        System.out.println("\nTask 4 (Factorial of 5):");
        System.out.println("Result: " + Part1.factorial(5));


        // --- PART 2: SEQUENCES ---
        System.out.println("\n=== PART 2: SEQUENCES ===");

        System.out.println("Task 5 (Fibonacci 17th number):");
        System.out.println("Result: " + Part2.fibonacci(17));

        System.out.println("\nTask 6 (Power 2^10):");
        System.out.println("Result: " + Part2.power(2, 10));

        System.out.println("\nTask 7 (Reverse Output):");
        System.out.println("Please enter '4', then four numbers (e.g., 1 4 6 2):");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            Part2.reverseOutput(n, sc);
            System.out.println();
        }


        // --- PART 3: STRINGS ---
        System.out.println("\n=== PART 3: STRINGS ===");

        System.out.println("Task 8 (Check Digits):");
        System.out.println("123456: " + Part3.isAllDigits("123456"));
        System.out.println("123a12: " + Part3.isAllDigits("123a12"));

        System.out.println("\nTask 9 (Count Characters in 'recursion'):");
        System.out.println("Result: " + Part3.countChars("recursion"));

        System.out.println("\nTask 10 (GCD of 32 and 48):");
        System.out.println("Result: " + Part3.gcd(32, 48));

        System.out.println("\n=== ALL TASKS COMPLETED ===");
        sc.close();
    }
}