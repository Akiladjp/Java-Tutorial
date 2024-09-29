package Java_Exersices;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        int num = scanner.nextInt();

        int answer = 1;

        while(num != 0) {
            answer = answer * num;
            num --;
        }

        System.out.println(answer);
    }
}
