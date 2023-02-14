// Вывести все простые числа от 1 до 1000

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

public class DZ_1_2 {

    public static void main(String[] args) {
        int num = 1000;

        System.out.printf("Простых чисел от 1 до n: %d\n", count_arr_prime_num_1_n(num));

    }

    static int count_arr_prime_num_1_n(int end_n) {
        int count = 0;

        if (end_n == 1) {
            return count = 1;
        } else if (end_n == 2) {
            return count = 2;
        } else if ((end_n > 2) && (end_n > 0)) {
            count = 2;

            for (int j = 3; j <= end_n; j++) {
                for (int i = 2; i <= j; i++) {
                    if (i == j) {
                        count++;
                    } else if (j % i == 0) {
                        break;
                    }
                }
            }
            return count;
        }
        return count;
    }

    // static int[] arr_prime_num_1_n(int count_n) {
    //     int[] arr = new int[count_n];

    //     for (int i = 1; i <= end_n; i++) {
    //         arr.append(i);
    //     }

    //     return arr;
    // }

}

// ============================================================================
