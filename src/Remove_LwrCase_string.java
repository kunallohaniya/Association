import java.util.Scanner;

public class Remove_LwrCase_string {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result += ch;
            }
        }
        System.out.println("String after removing lowercase characters: " +result);
    }
}
