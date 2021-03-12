import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        System.out.println(FindFibonacciSequenceSum(4000000));
    }
    static int FindFibonacciSequenceSum(int max) {
        int sum = 0;
        ArrayList<Integer> sequence = new ArrayList<>(GenerateEvenFibonacci(max));

        for (Integer element : sequence) {
                sum += element;
        }
        return sum;
    }
    static ArrayList<Integer> GenerateEvenFibonacci(int max) {
        int fib_sum = 0;
        int fib = 1;
        ArrayList<Integer> sequence = new ArrayList<>();

        while (fib < max) {
            if (fib % 2 == 0) {
                sequence.add(fib);
            }
            fib += fib_sum;
            fib_sum = fib - fib_sum;
        }
        return sequence;
    }
}
