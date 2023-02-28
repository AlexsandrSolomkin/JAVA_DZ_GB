// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

package DZ_JAVA.DZ_SEMINAR_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DZ_3_2 {
    public static void main(String[] args) {
        List<Integer> n_arr = new ArrayList<>();
        List<Integer> new_arr = new ArrayList<>();

        n_arr = arr_rand(0, 100, 30);

        for (int i : n_arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        new_arr = new_l(n_arr);

        for (int i : new_arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static List<Integer> arr_rand(int min_a, int max_a, int num_a) {
        List<Integer> new_arr = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < num_a; i++) {
            new_arr.add(rand.nextInt(min_a, max_a));
        }

        return new_arr;
    }

    static List<Integer> new_l(List<Integer> list_a){
        for(int i = 0; i < list_a.size(); i++){
            if (list_a.get(i) % 2 == 0){
                list_a.remove(i);
                i--;
            }
        }

        return list_a;
    }
}
