import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class wh_Q3 {
    public static void main(String[] args) {
        System.out.printf("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int scInput = sc.nextInt();
        int remainder;
        int reverse = 0;

        while (scInput != 0) {
            remainder = scInput % 10;
            reverse = reverse * 10 + remainder;
            scInput = scInput / 10;
        }
        System.out.printf("The reversed number is: " + reverse);
    }
}