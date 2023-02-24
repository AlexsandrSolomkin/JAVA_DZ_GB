// Написать метод который приводит сторку к нормальному виду

// строка на вход
// Добрый день Как дела Все хорошо

// выход
// Добрый день. Как дела. Все хорошо.

// ============================================================================

// Решение:

package DZ_JAVA.DZ_SEMINAR_2;

import java.util.Scanner;

import java.io.*;

public class DZ_2_1 {
    public static void main(String[] args) {
        try {

            String separ = File.separator;
            String path = "DZ_JAVA" + separ + "DZ_SEMINAR_2" + separ + "DZ_2_1_test.txt";
            String new_path = "DZ_JAVA" + separ + "DZ_SEMINAR_2" + separ + "DZ_2_1_res.txt";

            File test_f = new File(path);

            if (!test_f.exists()) {
                test_f.createNewFile();
            }

            Scanner scan_f = new Scanner(test_f);
            String data_f = scan_f.nextLine();
            String[] words = data_f.split(" ");
            String res = good_text(words, " ", ".");

            scan_f.close();

            FileWriter res_file = new FileWriter(new_path);

            try {
                res_file.write(res);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                res_file.close();
            }

        } catch (IOException e) {
            System.out.print("Error:" + e);
        }
    }

    static String good_text(
            String[] start_text,
            String sep,
            String symbol) {

        StringBuilder new_text = new StringBuilder();

        new_text.append(start_text[0]);

        for (int i = 1; i < start_text.length; i++) {
            String st_1 = start_text[i];
            String st_2 = st_1.toLowerCase();

            if (st_1 == st_2) {
                new_text.append(sep);
                new_text.append(st_1);
            } else {
                new_text.append(symbol);
                new_text.append(sep);
                new_text.append(st_1);
            }
        }

        new_text.append(symbol);

        return new_text.toString();
    }
}

// ============================================================================
