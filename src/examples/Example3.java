package examples;

import java.util.Random;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        statistics(days);

    }

    private static void statistics(int days) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < days; i++) {
            int nextPrecipitation = getPrecipitation();
            sum += nextPrecipitation;
            if (max < nextPrecipitation) {
                max = nextPrecipitation;
            }
        }

        System.out.printf("Колличество дней: %s;\n  Сумма осадков за этот период: %s;\n  Среднее количество осадковЖ %s;\n Mаксимальное колличество осадков: %s\n",
                days, sum, sum / days, max);
    }

    private static int getPrecipitation() {
        return new Random().nextInt(100);
    }
}

