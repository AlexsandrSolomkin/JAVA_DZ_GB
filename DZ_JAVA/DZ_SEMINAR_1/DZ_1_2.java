// Вывести все простые числа от 1 до 1000

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_1;

public class DZ_1_2 {

    public static void main(String[] args) {
        int num = 20;
        int ell_arr = count_arr_prime_num_1_n(num);
        int[] arr_ell = arr_prime_num_1_n(ell_arr, num);

        System.out.printf("n = %d\n", num);
        System.out.printf("Простых чисел от 1 до n: %d\n", ell_arr);
        System.out.printf("Простые числа от 1 до n:\n");

        for (int item : arr_ell) {
            System.out.printf("%d\n", item);
        }
        
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

    static int[] arr_prime_num_1_n(int count_n, int end_n) {
        int[] arr = new int[count_n];
        int index = 0;

        for (int k = 1; k <= end_n; k++) {
            for (int l = 1; l <= k; l++) {
                if (l == k) {
                    arr[index] = k;
                    index++;
                } else if ((k % l == 0) && (l > 1)) {
                    break;
                }
            }
        }
        return arr;
    }
}

// ============================================================================
