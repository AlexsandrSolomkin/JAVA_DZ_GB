// 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

package DZ_JAVA.DZ_SEMINAR_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DZ_3_1 {
    public static void main(String[] args) {
        List<Integer> n_arr = new ArrayList<>();

        n_arr = arr_rand(0, 100, 10);

        Collections.sort(n_arr);

        for (int i : n_arr) {
            System.out.print(i + " ");
        }

        int min_n = n_arr.get(0);
        int max_n = n_arr.get(n_arr.size() - 1);
        double centr_n = centr_list(n_arr);

        System.out.printf("\nМин: %d\nМакс: %d\nСреднее: %f\n", min_n, max_n, centr_n);

    }

    static List<Integer> arr_rand(int min_a, int max_a, int num_a) {
        List<Integer> new_arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < num_a; i++) {
            new_arr.add(rand.nextInt(min_a, max_a));
        }

        return new_arr;
    }

    static double centr_list(List<Integer> ar){
        int count_n = ar.size();
        double res = 0;
        
        for(int i = 0; i < count_n; i++){
            res = res + ar.get(i); 
        }

        res = res / count_n;

        return res;
    }

}
