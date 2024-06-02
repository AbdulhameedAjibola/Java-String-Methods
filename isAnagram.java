import java.util.Arrays;
import java.util.Scanner;;

public class isAnagram {

    static boolean areAnagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        char firstArray[] = str1.toCharArray();
        char secondArray[] = str2.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word");
        String str1 = sc.nextLine();
        System.out.println("Please enter another word");
        String str2 = sc.nextLine();

        if (areAnagram(str1, str2)) {
            System.out.println("They are anagrams");
        }
        else{
            System.out.println("They are not anagrams");
        }
    }
}
