import java.util.Scanner;

public class wh_Q2 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int x =num, y=0;
        while(num>=0){
            y+=num;
            num--;
        }
        System.out.println("Total of "+x+" is: "+y);
    }
}