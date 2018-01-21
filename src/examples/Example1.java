package examples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        System.out.println(isSum(number, sum));
    }

    private static int isSum(int number, int sum) {
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
