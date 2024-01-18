/*
    Напишите метод isUnique, который принимает Map < string, string> в качестве параметра и возвращает true,
    если никакие два ключа не отображаются на одно и то же значение
    (и false, если любые два или более ключа соответствуют одному и тому же значению).
    Например, вызов вашего метода на следующем словаре вернет
    true:
        {Marty=Stepp, Stuart-Reges, Jessica=Miller, Amanda-Camp, Hal-Perkins}
    Вызов его на следующем словаре вернул бы false из-за двух отображений для Perkins и Reges:
        {Kendrick=Perkins, Stuart-Reges, Jessica-Miller, Bruce=Reges, Hal=Perkins}
    Пустой словарь считается уникальным, поэтому ваш метод должен возвращать true, если передается пустой словарь.
*/

package bilet_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static boolean isUnique(Map<String, String> data) {
        Set<String> unique_set = new HashSet<>();
        for (Map.Entry<String, String> item : data.entrySet()) {
            if (unique_set.contains(item.getValue())) return false;
            unique_set.add(item.getValue());
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String> true_map  = new HashMap<String, String>() {{
            put("Marty", "Stepp");
            put("Stuart", "Reges");
            put("Jessica","Miller");
            put("Amanda","Camp");
            put("Hal","Perkins");
        }};
        System.out.println("True map: " + isUnique(true_map));

        Map<String, String> false_map  = new HashMap<String, String>() {{
            put("Kendrick", "Perkins");
            put("Stuart", "Reges");
            put("Jessica", "Miller");
            put("Bruce", "Reges");
            put("Hal", "Perkins");
        }};
        System.out.println("False map: " + isUnique(false_map));
    }
}
