/*
Напишите метод под названием alternate, который принимаст два списка целых чисел в качестве
параметров и возвращает новый список, содержащий чередующиеся элементы из двух списков, в следующем порядке:
• Первый элемент из первого списка
• Первый элемент из второго списка
..•
Второй элемент из первого списка
Второй элемент из второго списка
Третий элемент из первого списка
• Третий элемент из второго списка
Если списки не содержат одинаковое количество элементов,
оставшиеся элементы из более длинного списка должны быть расположены последовательно в конце.
Например, для первого списка (1, 2, 3, 4, 5) и второго списка (6, 7, 8, 9, 10, 11, 12) вызов alternate
(list1, list2) должен вернуть список, содержащий (1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12).
Не изменяйте передаваемые списки параметров.
*/

package bilet_1;

public class Main {
    public static int[] alternate(int[] list1, int[] list2) {
        int[] res = new int[list1.length + list2.length];
        int l = 0, r = 0;
        int cur_idx = 0;
        while (l < list1.length && r < list2.length) {
            res[cur_idx] = (cur_idx % 2 == 0 ? list1[l++] : list2[r++]);
            ++cur_idx;
        }

        while (l < list1.length) {
            res[cur_idx++] = list1[l++];
        }

        while (r < list2.length) {
            res[cur_idx++] = list2[r++];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{6, 7, 8, 9, 10, 11, 12};
        int[] res = alternate(list1, list2);

        for (int x : res) {
            System.out.printf("%d ", x);
        }
    }
}
