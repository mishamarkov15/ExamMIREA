/*
Напишите метод reverse, который принимает Мар от целых чисел к строкам в качестве параметра и
возвращает новый Мар из строк к целым числам, который является «зеркальным отображением» оригинальной структуры.
Риверс исходного Мар определяется здесь как новый Мар, который использует значения из оригинала в
качестве своих ключей и ключи от оригинала в качестве своих значений.
Поскольку значения Мар не обязательно должны быть уникальными, а его ключи обязательно должны быть уникальными,
допустимо иметь любой из исходных ключей в результате в качестве значения.
Другими словами, если исходный словарь имеет пары (k1, v) и (k2, v),
то новый словарь должен содержать либо пару (v, k1), либо (v, k2).
*/

package bilet_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> reverse(Map<Integer, String> data) {
        Map<String, Integer> res = new HashMap<>();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            if (!res.containsKey(entry.getValue())) {
                res.put(entry.getValue(), entry.getKey());
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        data.put(5, "apple");
        data.put(2, "orange");
        data.put(7, "orange");
        data.put(9, "tomato");

        var res = reverse(data);
        for (Map.Entry<String, Integer> item : res.entrySet()) {
            System.out.printf("%s: %d\n", item.getKey(), item.getValue());
        }
    }
}
