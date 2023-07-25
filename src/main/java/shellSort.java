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
    public void sortSecond(int[] arrrayToSort, int n) {
        int i, j, step;
        int tmp;
        for(step = n /2; step > 0; step /= 2)
            for(i = step; i < n; i++) {
                tmp = arrrayToSort[i];
                for(j = i; j >= step; j -= step) {
                    if(tmp < arrrayToSort[j - step])
                        arrrayToSort[j] = arrrayToSort[j - step];
                    else
                        break;
                }
                arrrayToSort[j] = tmp;
            }
    }
    public static void main(String[] args) {
        int[] input = {57, 78, 13, 89, 1, 32, 21, 8};
        sortFirst(input);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

        System.out.println();
        System.out.println();

        int[] input_2 = {98, 8, 21, 9, 19, 88, 1, 65};
        new shellSort().sortSecond(input_2, input_2.length);
        for (int i = 0; i < input_2.length; i++) {
            System.out.println(input_2[i]);
        }
    }
}
