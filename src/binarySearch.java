public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 8, 12, 17, 19, 25};
        System.out.println(binarySearch(array,  3));
    }

    public static int binarySearch(int[] arr, int elementToSearch) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if(arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                leftIndex = middleIndex + 1;
            } else  if (arr[middleIndex] > elementToSearch) {
                rightIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
