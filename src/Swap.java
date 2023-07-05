public class Swap {
    public static void main(String[] args) {
        int[] arrays = {354, 456, 576, 87, 1, 456, 56, 4578};
        swapMethod(arrays, 0, 4);
        for(int num : arrays) {
            System.out.println(num);
        }
    }
    public static void swapMethod(int[] items, int left, int right) {
        if(left != right) {
            int tmp = items[left];
            items[left] = items[right];
            items[right] = tmp;
        }
    }
}
