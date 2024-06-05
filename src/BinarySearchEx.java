public class BinarySearchEx {
    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 10, 12, 59};
        int key = 10;
        int result = binarySearch(arr, key);
        if (result == -1) {
            System.out.println("Key not present in the array");
        } else {
            System.out.println("Key's index is: " + result);
        }
    }

    public static int binarySearch(int[] a, int key) {
        int start = 0, end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else if (a[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}




