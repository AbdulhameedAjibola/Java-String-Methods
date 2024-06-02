import java.util.Scanner;
import java.util.Arrays;

public class isPalindrome{

    private static boolean palindrome(String str){
        str = str.trim();
        str = str.toLowerCase();
        int x = 0;
        int y = str.length() - 1;

        while (x < y) {
            if (str.charAt(x) != str.charAt(y)) 
                return false;
                x++;
                y--;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        palindrome(str);
        
        if(palindrome(str)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}