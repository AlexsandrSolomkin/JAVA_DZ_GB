// Реализовать простой калькулятор

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

import java.util.Scanner;

public class DZ_1_3 {
    public static void main(String[] args) {
        String t_1 = "Введите число: ";
        String t_2 = "Введите (число: действие(1: +, 2: -, 3: *, 4: /)): ";

        double num_1 = scan_double(t_1);
        
        double action = scan_double(t_2);
        double num_2 = scan_double(t_1);
        
        double res = simple_calc(num_1, num_2, action);
        String act_calc_1 = act_calc(action);

        System.out.printf("%f %s %f = %f", num_1, act_calc_1, num_2, res);
    }

    static double scan_double(String text_1) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("%s", text_1);
        double answer_1 = iScanner.nextDouble();
        // iScanner.close();
        return answer_1;
    }

    static String act_calc(double act_c) {
        String act_res = "";

        if (act_c == 1) {
            act_res ="+";
        } else if (act_c == 2) {
            act_res ="-";
        } else if (act_c == 3) {
            act_res ="*";
        } else if (act_c == 4) {
            act_res ="/";
        }

        return act_res;
    }

    static double simple_calc(double a, double b, double act) {
        double res_calc = 0;

        if (act == 1) {
            res_calc = sum(a, b);
        } else if (act == 2) {
            res_calc = diff(a, b);
        } else if (act == 3) {
            res_calc = mult(a, b);
        } else if (act == 4) {
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
