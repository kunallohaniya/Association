import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheck_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();

        boolean isAnagram = areAnagrams(str1,str2);
        if(isAnagram){
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() !=s2.length()){
            return false;
        }
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        for(int i=0; i<charArray1.length; i++) {
            if(charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
