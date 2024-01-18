package bilet_4;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean hasOdd(Set<Integer> data) {
        if (data.isEmpty()) return false;
        for (Integer value : data) {
            if (value % 2 != 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Set<Integer> data = new HashSet<>();
        data.add(1);
        data.add(2);
        data.add(5);
        data.add(3);
        System.out.println("Answer: " + hasOdd(data));
    }
}
