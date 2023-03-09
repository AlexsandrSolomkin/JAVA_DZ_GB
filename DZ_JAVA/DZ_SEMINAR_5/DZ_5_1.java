// Учитывая два целочисленных массива nums1 и nums2, верните максимальную длину подмассива, который появляется в обоих массивах.

// Example 1:
// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].

// Example 2:
// Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
// Output: 5
// Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].

package DZ_JAVA.DZ_SEMINAR_5;

import java.util.ArrayList;
import java.util.Scanner;

public class DZ_5_1 {
    public static void main(String[] args) {
        Scanner scanner_data = new Scanner(System.in);
        String name_array_1 = "num_1";
        String name_array_2 = "num_2";

        // Данные для теста
        // =========================================================================================
        ArrayList<Integer> array_1 = new ArrayList<>();
        array_1.add(1);
        array_1.add(2);
        array_1.add(3);
        array_1.add(2);
        array_1.add(1);
        // array_1.add(0); array_1.add(0); array_1.add(0); array_1.add(0);
        // array_1.add(0);

        ArrayList<Integer> array_2 = new ArrayList<>();
        array_2.add(3);
        array_2.add(2);
        array_2.add(1);
        array_2.add(4);
        array_2.add(7);
        // array_2.add(0); array_2.add(0); array_2.add(0); array_2.add(0);
        // array_2.add(0);
        // =========================================================================================

        // Заполнение, РАБОТАЕТ
        // ArrayList<Integer> array_1 = scanner_array_data(scanner_data, name_array_1);
        // ArrayList<Integer> array_2 = scanner_array_data(scanner_data, name_array_2);

        // Вывод, РАБОТАЕТ
        // print_array(array_1, name_array_1);
        // print_array(array_2, name_array_2);

        // Максимальный подмассив, РАБОТАЕТ
        ArrayList<Integer> result_array = mini_array_in_2_array(array_1, array_2);

        print_array(result_array, "num_res");

    }

    // Метод вывода массива
    static void print_array(ArrayList<Integer> array, String name_array) {
        System.out.printf("\nМассив %s = ", name_array);
        System.out.println(array);
    }

    // Метод занесения данных в массив
    static ArrayList<Integer> scanner_array_data(Scanner scanner_value, String name_array) {
        ArrayList<Integer> data_array = new ArrayList<Integer>();
        boolean flag_input = true;
        System.out.printf("\nВвод данных для массива %s\n", name_array);
        System.out.println("==========================================");

        while (flag_input == true) {
            System.out.print("\nВвести данные?\n1 - Да\n2 - Нет\nОтвет: ");
            int answer = scanner_value.nextInt();

            if (answer == 1) {
                System.out.print("Введите целое число: ");
                int input_data = scanner_value.nextInt();
                data_array.add(input_data);

            } else if (answer == 2) {
                flag_input = false;

            } else {
                System.out.println("Такое действие не предусмотренно.");
            }
        }
        System.out.printf("\nВвод данных для массива %s прерван\n", name_array);
        System.out.println("==========================================");
        return data_array;
    }

    // Метод возвращающий максимальный подмассив встречающийся в 2 массивах
    static ArrayList<Integer> mini_array_in_2_array(ArrayList<Integer> array_left, ArrayList<Integer> array_rigth) {
        ArrayList<Integer> mini_array_max = new ArrayList<Integer>();
        ArrayList<Integer> mini_array = new ArrayList<Integer>();

        for (int i = 0; i < array_left.size(); i++) {
            int k = i;

            for (int j = 0; ((k < array_left.size()) && (j < array_rigth.size())); j++) {

                if (array_left.equals(array_rigth)) {
                    mini_array_max.addAll(array_left);
                    return mini_array_max;
                }

                if (array_left.get(k) == array_rigth.get(j)) {
                    mini_array.add(array_left.get(k));
                }

                if (array_left.get(k) != array_rigth.get(j)) {

                    if (mini_array_max.size() < mini_array.size()){
                        mini_array_max.clear();
                        mini_array_max.addAll(mini_array);
                        mini_array.clear();

                    } else {
                        mini_array.clear();
                    }

                    k = i;
                }

                k++;
            }
        }

        return mini_array_max;
    }
}
