import java.util.Scanner;
class strreplace{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String Str = sc. nextLine();

        System.out.println("enter replacement:");
        String rep = sc.nextLine();

        System.out.println("Enter your word to be replaced: ");
        String repl = sc. nextLine();
                  
        System.out.print("Original String : " ); 
        System.out.println(Str); 
              
        System.out.print("After replacing:" ); 
        System.out.println(Str.replace(repl, rep)    );          

    }
}