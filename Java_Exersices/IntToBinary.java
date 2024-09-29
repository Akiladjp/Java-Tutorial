package Java_Exersices;

import java.util.Scanner;

public class IntToBinary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt();
        System.out.println("Your number is " + num);

        int[] array = new int[num];
        int index = 0;


        do {
            array[index] = num % 2;
            num = num / 2;
            index++;
        } while (num != 0);

        for (int a = index-1; a >= 0; a--) {
            System.out.print(array[a]);
        }
        System.out.println();
    }
}
