import java.util.Scanner;

public class UprLwr_String {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countUppercase = 0, countLowercase = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)) {
                countUppercase++;
            }
            else if(Character.isLowerCase(ch)){
                countLowercase++;
            }
        }
        System.out.println("Total uppercase letters are: "+ countUppercase);
        System.out.println("Total lowercase letters are: "+ countLowercase);
    }
}
