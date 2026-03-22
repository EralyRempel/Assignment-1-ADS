import java.util.Scanner;

public class Part2 {

    //Task 5: Fibonacci

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //Task 6: Power Function

    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    //Task 7: Reverse Output

    public static void reverseOutput(int n, Scanner sc) {

        if (n <= 0) return;


        int current = sc.nextInt();


        reverseOutput(n - 1, sc);


        System.out.print(current + " ");
    }
}
