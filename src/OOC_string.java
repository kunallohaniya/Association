import java.util.Scanner;
public class OOC_string {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Enter a char to count: ");
        char charToCount = sc.next().charAt(0);
        int count = 0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==charToCount) {
                    count++;
            }
        }
        System.out.println(count);
    }
}
