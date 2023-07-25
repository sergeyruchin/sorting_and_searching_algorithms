public class shellSort {
    public static void sortFirst(int[] arrayToSort) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while(j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j -gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {57, 78, 13, 89, 1, 32, 21, 8};
        sortFirst(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }
}
