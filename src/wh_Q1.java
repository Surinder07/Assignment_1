import java.sql.SQLOutput;
import java.util.Scanner;

public class Wh_Q1 {
    public static void main(String[] args) {
        System.out.printf("Enter the number: ");
        Scanner sc=new Scanner(System.in);
        int sc1=sc.nextInt();
        int y=1;
        while(sc1>1){
            y*=sc1;
            sc1--;
        }

        System.out.printf("The factorial of "+sc1+ "is: "+y);


    }
}
