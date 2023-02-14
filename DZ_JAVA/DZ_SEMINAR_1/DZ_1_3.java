// Реализовать простой калькулятор

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

import java.util.Scanner;

public class DZ_1_3 {
    public static void main(String[] args) {
        Scanner num_1_Scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        double num_1 = num_1_Scanner.nextDouble();
        num_1_Scanner.close();

        Scanner action_Scanner = new Scanner(System.in);
        System.out.printf("Введите действие(+, -, *, /): ");
        String action = action_Scanner.nextLine();
        action_Scanner.close();

        Scanner num_2_Scanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        double num_2 = num_2_Scanner.nextDouble();
        num_2_Scanner.close();

        double res = simple_calc(num_1, num_2, action);

        System.out.printf("%f %s %f = %f", num_1, action, num_2, res);
    }

    static double simple_calc(double a, double b, String act) {
        double res_calc = 0;

        if (act == "+") {
            res_calc = sum(a, b);
        } else if (act == "-") {
            res_calc = diff(a, b);
        } else if (act == "*") {
            res_calc = mult(a, b);
        } else if (act == "/") {
            res_calc = div(a, b);
        }

        return res_calc;
    }

    static double sum(double a, double b) {
        double sum_res = a + b;
        return sum_res;
    }

    static double diff(double a, double b) {
        double diff_res = a - b;
        return diff_res;
    }

    static double mult(double a, double b) {
        double mult_res = a * b;
        return mult_res;
    }

    static double div(double a, double b) {
        double div_res = a / b;
        return div_res;
    }
}

// ============================================================================
