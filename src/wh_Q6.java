import java.util.Scanner;

public class wh_Q6 {
    public static void main(String[] args) {
        int number = 1234567;
        int new_num=0;
        while(number !=0){
            int remainder= number%10;
            new_num=new_num*10+remainder;
            number=number/10;
        }
        System.out.println("The reverse of 1234567 is: "+new_num);
    }
}
