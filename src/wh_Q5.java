import java.util.Scanner;

public class wh_Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the non-negative digits: " );
        Scanner sc = new Scanner(System.in);
        int scInput = sc.nextInt();
        int i=0, total=0;
        while (scInput >= 0) {
            total += scInput;
            i++;
            scInput=sc.nextInt();
        }
        System.out.println("The sum of the entered digits is: "+total);
        }
    }
