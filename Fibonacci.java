import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index in the fibonacci: ");
        int index = input.nextInt();
        int fibonacciNumber = findLocationFibonacci(index);
        System.out.println("The Value at position " + index + " in the fibonacci range is: " + fibonacciNumber);
    }

    public static int findLocationFibonacci(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else {
            int fibonacciNumber = findLocationFibonacci(index - 2) + findLocationFibonacci(index - 1);
            return fibonacciNumber;
        }
    }
}
