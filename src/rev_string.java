import java.util.Scanner;
public class rev_string {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] charArray = str.toCharArray();
        int l=0, r=charArray.length - 1;

        while(l < r){
            char t = charArray[l];
            charArray[l]=charArray[r];
            charArray[r]= t;
            l++;
            r--;
        }
        System.out.println(charArray);
    }
}
