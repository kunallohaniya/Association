import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] charArray = str.toCharArray();
        int length = charArray.length;

        System.out.println(removeDuplicates(charArray, length));
    }

    public static String removeDuplicates(char[] charArray, int length) {
        int index = 0;
        for (int i = 0; i < length; i++) {
            int j=0;
            for (; j < i; j++) {
                if (charArray[i] == charArray[j]) {
                    break;
                }
            }
            if (j == i) {
                charArray[index] = charArray[i];
                index++;
            }
        }
        return new String(charArray, 0, index);
    }
}

