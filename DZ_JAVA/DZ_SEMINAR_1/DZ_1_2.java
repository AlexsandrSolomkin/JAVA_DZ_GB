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

        for (int j = 1; j <= end_n; j++) {
            for (int i = 1; i <= j; i++) {
                if (i == j) {
                    count++;
                } else if ((j % i == 0) && (i > 1)) {
                    break;
                }
            }
        }
        return count;
        
    }

    // static int[] arr_prime_num_1_n(int count_n) {
    //     int[] arr = new int[count_n];

    //     if (count_n == 1) {
    //         return arr = new int[] {1};
    //     } else if (count_n == 2) {
    //         return arr = new int[] {1, 2};
    //     } else if ((count_n > 2) && (count_n > 0)) {
    //         int count_arr = 2;

    //         for (int j = 3; j <= count_n; j++) {
    //             for (int i = 2; i <= j; i++) {
    //                 if (i == j) {
    //                     count++;
    //                 } else if (j % i == 0) {
    //                     break;
    //                 }
    //             }
    //         }
    //         return count;
    //     }

    //     return arr;
    // }

}

// ============================================================================
