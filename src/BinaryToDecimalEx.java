import java.util.Scanner;

public class BinaryToDecimalEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
    int n=scanner.nextInt();
    int dec_num = 0, i = 0,remainder;

    while(n!=0) {
        remainder = n%10;
        n = n/10;
        dec_num = dec_num + remainder * (int)Math.pow(2,i);
        ++i;
    }
        System.out.println("The decimal number is: " + dec_num);
    }
}