public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {30, -5, 30, 20, -6, 5};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contains at least two elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr ){
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }
}
