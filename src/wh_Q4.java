import java.security.spec.ECField;
import java.util.Scanner;

public class wh_Q4 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int scInput = sc.nextInt();
        int EvenTotal = 0;
        int OddTotal = 0;
        while (scInput >= 1) {
            if (scInput % 2 == 0){
                EvenTotal += scInput;
            }

            else{
                OddTotal += scInput;
            }
            scInput--;

        }

        System.out.println("Sum of Even Numbers: "+ EvenTotal);

        System.out.println("Sum of Odd Numbers: "+ OddTotal);
    }
}