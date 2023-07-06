public class bubbleSort {
    public static void main(String[] args) {
        int[] arrays =  {34, 687, 1, 45, 999, 1, 82, 35};
        new bubbleSort().bubbleSortOne(arrays, arrays.length);

        for(int num : arrays) {
            System.out.println(num);
        }

        System.out.println();
        System.out.println();

        int[] arrays3 = {56, 8, 21, 99, 51, 77, 591, 1};
        new bubbleSort().bubbleSortThreeRevers(arrays3);

        for(int num : arrays3) {
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

    public void bubbleSortThreeRevers(int[] array) {
        for(int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
