// HashMap<Login, Список телефонов>
// - добалять телефон
// - удалять телефон
// - находить по логину телефон/список телефонов

package DZ_JAVA.DZ_SEMINAR_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DZ_4_1 {
    public static void main(String[] args) {
        Scanner sc_menu = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nТелефонный справочник:\n");

        HashMap<Integer, String> menu_phone_book = new HashMap<>();
        menu_phone_book = menu(menu_phone_book);

        HashMap<String, HashSet<String>> phone_book = new HashMap<>();

        boolean flag_menu = true;
        String name;
        String phone;

        while (flag_menu == true) {

            print_menu(menu_phone_book);
            System.out.println("\nВыполнить: ");
            int n_menu = sc_menu.nextInt();

            // добавить данные
            if (n_menu == 1) {
                System.out.println("\nКонтакт: ");
                name = sc.nextLine();
                System.out.println("\nНомер контакта: ");
                phone = sc.nextLine();

                add_data(phone_book, name, phone);

                // удалить данные
            } else if (n_menu == 2) {
                System.out.println("\nКонтакт: ");
                name = sc.nextLine();
                System.out.println("\nНомер контакта: ");
                phone = sc.nextLine();

                del_data(phone_book, name, phone);

                // вывести данные по человеку
            } else if (n_menu == 3) {
                System.out.println("\nКонтакт: ");
                name = sc.nextLine();

                print_data(phone_book, name);

                // прервать работу с данными
            } else if (n_menu == 4) {
                flag_menu = false;

                // справка
            } else {
                System.out.println("\nТакого пункта меню нет, попробуйте ещё раз.");
            }
        }

        sc_menu.close();
        sc.close();
    }

    // Реализация меню при помощи HashMap<>
    static HashMap<Integer, String> menu(HashMap<Integer, String> new_menu) {
        new_menu.put(1, "Добавить контакт, телефон");
        new_menu.put(2, "Удалить контакт, телефон");
        new_menu.put(3, "Телефоны контакта");
        new_menu.put(4, "Выход");

        return new_menu;
    }

    // Реализация вывода меню HashMap<> пользователю
    static void print_menu(HashMap<Integer, String> print_new_menu) {
        System.out.println("\nВыбирите пункт:\n");

        for (int i = 1; i <= print_new_menu.size(); i++) {
            System.out.printf("%d - %s\n", i, print_new_menu.get(i));
        }
    }

    // Реализация добавления данных
    static HashMap<String, HashSet<String>> add_data(
            HashMap<String, HashSet<String>> data_hm,
            String k_st,
            String st_add) {

        HashSet<String> v_hs = data_hm.getOrDefault(k_st, new HashSet<>());

        v_hs.add(st_add);
        data_hm.put(k_st, v_hs);

        return data_hm;
    }

    // Реализация удаления данных
    static HashMap<String, HashSet<String>> del_data(
            HashMap<String, HashSet<String>> data_hm,
            String k_st,
            String st_add) {

        HashSet<String> v_hs = data_hm.getOrDefault(k_st, new HashSet<>());

        if (data_hm.containsKey(k_st)) {

            v_hs.remove(st_add);
            data_hm.put(k_st, v_hs);

        } else {
            System.out.println("\nТакого контакта нет.\n");
        }

        return data_hm;
    }

    // Вывод данных по ключу
    static void print_data(HashMap<String, HashSet<String>> data_hm, String k_st) {
        System.out.printf("\nКонтакт: %s\nНомера: %s\n", k_st, data_hm.get(k_st));
    }
}
