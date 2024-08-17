import java.util.Scanner;

public class HackerRankTest2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        scan.nextLine();  // Consume the newline after the integer input

        String[] array = new String[test];

        for (int i = 0; i < test; i++) {
            array[i] = scan.nextLine();
        }

        for (int x = 0; x < array.length; x++) {
            String number = array[x];

            try {
                long length = Long.parseLong(number);
                System.out.println(number + " can be fitted in:");

                if (length >= Byte.MIN_VALUE && length <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (length >= Short.MIN_VALUE && length <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (length >= Integer.MIN_VALUE && length <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (length >= Long.MIN_VALUE && length <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                System.out.println(number + " can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}

