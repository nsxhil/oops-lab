
import java.util.Scanner;
public class eval {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][3];

    System.out.println("enter matrix");

    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            a[i][j] = sc.nextInt();
        }
    }

    System.out.println("the entered matrix: ");
    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            System.out.print(a[i][j] + " ");
        }
    System.out.println("");
    }


    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            if(a[i][j] == 1){
                a[i][j] = 0;
            }
        }
    }

    System.out.println("After replacing 1 with 0");
    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            System.out.print(a[i][j] + " ");
        }
    System.out.println("");
    }
    sc.close();


}
}
