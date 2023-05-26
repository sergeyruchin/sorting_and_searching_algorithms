import java.sql.SQLOutput;

public class binarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 7, 8, 12, 17, 19, 25};
        System.out.println(new binarySearch().binarySearch(array,  5));
        System.out.println(binarySearch(0, array.length - 1, 6, array));
    }

    public int binarySearch(int[] arr, int elementToSearch) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while(leftIndex <= rightIndex) {
            int middleIndex = leftIndex + (rightIndex - leftIndex) / 2; //(leftIndex + rightIndex) / 2;
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

    public static int binarySearch(int leftIndex, int rightIndex, int elementToSearch, int []arr) {

        if (leftIndex > rightIndex) {
            System.out.println("Элемент не найден");
            return -2;
        }
        int middleIndex = leftIndex + (rightIndex - leftIndex) / 2; //int middleIndex = (leftIndex + rightIndex) / 2;
            if (arr[middleIndex] == elementToSearch)
                return middleIndex;
            else if (elementToSearch < arr[middleIndex])
                return binarySearch(leftIndex, middleIndex - 1, elementToSearch, arr);
            else if (elementToSearch > arr[middleIndex])
                return binarySearch(middleIndex + 1, rightIndex, elementToSearch, arr);
            return -1;
    }
}
