import java.util.Scanner;
class strops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s = sc. nextLine();

        System.out.println("No. of words: " + countwords(s));
        System.out.println("No. of vowels: " + countvowels(s));

    }

    static int countwords(String text){
        String[] words = text.split("\\s+");
        return words.length;
    }

    static int countvowels(String txt){
        int count = 0;
        for(int i=0; i<txt.length(); i++){
            txt = txt.toLowerCase();
            char c = txt.charAt(i);
            if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                count=count+1;
        }
        return count;
    }


}