public class linearSearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4 ,56 ,76, 45, 43, 453, 345};
        int rsl = linearSearch(arr, 5657);

        System.out.println(rsl);

    }

    public static int linearSearch(int arr[], int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
}

