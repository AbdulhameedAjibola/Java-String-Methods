import java.util.Arrays;
import java.util.Scanner;
public class reverse {
    static void reverseMethod(String word){
        
        char reverse[] = new char[word.length()];
        int length = word.length() - 1;
        int j = 0;
        for(int i = length; i >= 0; i-- ){
            
            reverse[j] = word.charAt(i);
            j++;
        }
        String newWord = new String(reverse);
        System.out.println(newWord);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a word to be reversed");
        String word = sc.nextLine();

        reverseMethod(word);
    }
}
