public class quickSort_Hoare {
    public static void quickSort(int[] sortArr, int low, int high) {
        //завершить, если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high)
            return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделяем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border)
                i++;
            while (sortArr[j] > border)
                j--;
            if(i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        // рекурсия для сортировки левой и правой части
        if(low < j)
            quickSort(sortArr, low, j);
        if(high > i)
            quickSort(sortArr, i, high);
    }

    public static void main(String[] args) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        quickSort(sortArr, 0, sortArr.length - 1);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i] + "\n");
        }
    }
}
