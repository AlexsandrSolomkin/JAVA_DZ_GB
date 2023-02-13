// Вычислить n-ое треугольное число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

import java.util.Scanner;

public class DZ_1_1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int num = iScanner.nextInt();

        System.out.printf("Сумма чисел от 1 до n: %d\n", sum_num_1_n(num));
        System.out.printf("Произведение чисел от 1 до n: %d\n", mult_num_1_n(num));
    }

    static int sum_num_1_n(int end_n) {
        int res = 0;

        for (int i = 1; i <= end_n; i++) {
            res += i;
        }

        return res;
    }

    static int mult_num_1_n(int end_n) {
        int res = 1;

        for (int i = 1; i <= end_n; i++) {
            res *= i;
        }

        return res;
    }
}

// ============================================================================
