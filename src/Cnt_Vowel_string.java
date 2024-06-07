import java.util.Scanner;

public class Cnt_Vowel_string {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        str = str.toLowerCase();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("No. of vowels in a string are: "+count);
    }
}
