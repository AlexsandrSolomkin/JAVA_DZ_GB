// Реализовать простой калькулятор

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

import java.util.Scanner;

public class DZ_1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        double num_1 = iScanner.nextDouble();
        System.out.printf("Введите действие(+, -, *, /): ");
        String action = iScanner.nextLine();
        System.out.printf("Введите число: ");
        double num_2 = iScanner.nextDouble();

        double res = 0;

        System.out.printf("%f %s %f = %f", num_1, action, num_2, res);
    }

    
}

// ============================================================================
