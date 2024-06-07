import java.util.Scanner;

public class Cnt_freq_string {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter the character to find its frequency: ");
        char ch = sc.next().charAt(0);
        int freq = 0;
        for(int i=0; i<str.length(); i++) {
            if(ch == str.charAt(i)) {
                freq++;
            }
        }
        System.out.println("Frequency of "+ ch + " = "+ freq);
    }
}
