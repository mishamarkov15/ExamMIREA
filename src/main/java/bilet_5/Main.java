/*
Напишите метод rarest, который принимает Мар, ключи которого являются строками,
а значения являются целыми числами, в качестве параметра.
Метод возвращает целочисленное значение, которое встречается в словаре наименьшее количество раз.
Если словарь не пуст, то верните меньшее целочисленное значение. Если словарь пуст, сгенерируйте исключение.

Например, предположим, что словарь содержит сопоставления имен студентов(строки) и их возраста (целые числа).
Ваш метод вернет наименее часто встречающийся возраст. Рассмотрим переменную словаря т,
содержащую следующие пары ключ / значенне:

(Alyssa-22, Char-25, Dan=25, Jeff-20, Kasey -20, Kim=20, Mogran=25, Ryan-25, Stef -22;

Три человека имеют возраст 20 лет (Джефф, Кейси и Ким), и два человека - 22 года (Алисса и Стеф),
и четыре человека - 25 лет (Чар, Дэн, Могран и Райан).
Таким образом, сетод rarest (м) возвращает 22, потому что только два человека имеют этот возраст.
*/

package bilet_5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Integer rarest(Map<String, Integer> data) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (Map.Entry<String, Integer> item : data.entrySet()) {
            var key = item.getValue();
            if (counter.containsKey(key)) {
                counter.put(key, counter.get(key) + 1);
            } else {
                counter.put(key, 1);
            }
        }

        Integer min_key = 0;
        Integer min_value = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> item : counter.entrySet()) {
            if (min_value > item.getValue()) {
                min_value = item.getValue();
                min_key = item.getKey();
            }
        }
        return min_key;
    }

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>() {{
            put("Alyssa", 22);
            put("Char", 25);
            put("Dan", 25);
            put("Jeff", 20);
            put("Kasey", 20);
            put("Kim", 20);
            put("Morgan", 25);
            put("Ryan", 25);
            put("Stef", 22);
        }};
        System.out.println("Rarest: " + rarest(ages));
    }
}
