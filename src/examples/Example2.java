=package examples;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for (int i = value - 1; i >= 0; i--) {
            System.out.println(fibonachi(i));
        }
    }

    private static int fibonachi(int i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonachi(i - 1) + fibonachi(i - 2);
        }
    }

}


