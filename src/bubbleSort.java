public class bubbleSort {
    public static void main(String[] args) {
        int[] arrays =  {34, 687, 1, 45, 999, 1, 82, 35};
        new bubbleSort().bubbleSortOne(arrays, arrays.length);

        for(int num : arrays) {
            System.out.println(num);
        }
    }

    public void bubbleSortOne(int[] array, int n) {
        for(int i = n - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
