import java.util.Scanner;

public class Task1 {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.println(FindSumOfMultiplesOf3And5(value));
    }

    static int FindSumOfMultiplesOf3And5(int max) {
        int sum = 0;
        for (int i = 1; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
