import java.util.Arrays;
import java.util.Scanner;
public class menu {
    
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true; 
    }

    static String sort(String s){
        s = s.replace(" ", "");
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String str = new String(c);
        return str;
        
    }

    static String reverse(String s){
        int length = s.length();
        StringBuilder reversed = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter str");
        String s = sc.nextLine();

        System.out.println("Enter 1-check palindrome , 2-sort string, 3-reverse string, 4-concat og and reverse \n");
        int sw = sc.nextInt();

        switch(sw){
            case 1:
            if(isPalindrome(s))
            System.out.println("is palindrome");
            else{System.out.println("Not palindrome");}
            break;

            case 2:
                System.out.println(sort(s));
                break;
            case 3 :
                System.out.println(reverse(s));
                break;
            case 4:
                String rev = reverse(s);
                System.out.println(s.concat(rev)); 
                break; 
            default:
            System.out.println("wrong choice.");
            }

    
    }
    
}
