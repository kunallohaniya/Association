public class LinearSearchEx {
    public static void main(String[] args) {
        int[] arr = {2, 56, 12, 45, 3, 8};
        int key = 12;
        int result = linearSearch(arr, key);
        if (result == -1) {
            System.out.println("Key is not present in the array");
        } else {
            System.out.println("Key's index is: " + result);
        }
    }

    public static int linearSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (key == a[i]) {
                return i;
            }
        }
        return -1;
    }
}