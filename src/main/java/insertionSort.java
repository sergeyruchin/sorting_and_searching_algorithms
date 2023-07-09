import java.util.Scanner;

public class insertionSort {

    public static void main(String[] args) {
        int[] actual = {34, 46, 768, 7, 12, 989, 1};
        insertionSort(actual);

        for (int i = 0; i < actual.length; i++) {
            System.out.println(actual[i]);
        }
    }

    public static void insertionSort(int[] sortArr) {
        int j;
        // сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for(int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}
