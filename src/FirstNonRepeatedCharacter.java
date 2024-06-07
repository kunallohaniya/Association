import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char result = FirstFirstNonRepeatedCharacter(str);

        if(result != 0) {
            System.out.println("The first non-repeated character is: "+result);
        }
        else{
            System.out.println("All characters are repeated.");
        }
    }

    public static char FirstFirstNonRepeatedCharacter(String s) {
        for(int i=0; i<s.length(); i++) {
           char ch = s.charAt(i);
           boolean isRepeated = false;

           for(int j=0; j< s.length(); j++) {
               if(i != j && ch == s.charAt(j)) {
                   isRepeated = true;
                   break;
               }
           }
           if(!isRepeated) {
               return ch;
            }
        }
        return 0;
    }
}
