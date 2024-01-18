/*
Напишите метод equals, который принимает в качестве параметров два стека целых чисел,
метод возвращает true, если два стека равны, и в противном случае возвращает false.
Чтобы считаться равными, два стека должны хранить одинаковую последовательность целочисленных значений
в одном и том же порядке. Ваш метод заключается в проверке двух стеков, но перед завершением работы
метода необходимо вернуть их в исходное состояние. Вы можете использовать один стек в качестве
вспомогательногохранения.
*/

package bilet_14;

import java.util.Objects;
import java.util.Stack;

public class Main {
    public static boolean isEqual(Stack<Integer> lhs, Stack<Integer> rhs) {
        if (lhs.size() != rhs.size()) return false;
        Stack<Integer> tmp = new Stack<>();
        boolean flag = true;
        while (!lhs.empty()) {
            var l = lhs.pop();
            tmp.push(l);

            var r = rhs.pop();
            tmp.push(r);

            if (!Objects.equals(l, r)) {
                flag = false;
                break;
            }
        }
        while (!tmp.empty()) {
            rhs.push(tmp.pop());
            lhs.push(tmp.pop());
        }
        return flag;
    }

    public static void main(String[] args) {
        Stack<Integer> left = new Stack<>();
        left.push(1);
        left.push(2);
        left.push(3);

        Stack<Integer> right = new Stack<>();
        right.push(1);
        right.push(2);
        right.push(3);

        System.out.println("isEqual: " + isEqual(left, right));
    }
}
