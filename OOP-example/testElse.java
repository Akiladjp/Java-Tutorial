import java.util.Scanner;

public class testElse {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a Color (Blue / Green / Yellow)");
        String word = scanner.nextLine();

        word = word.toLowerCase();

        if(word.equals("blue")) {
            System.out.println("Your number is 1");
        }

        else if(word.equals("green")) {
            System.out.println("Your number is 2");
        }

        else if(word.equals("yellow")) {
            System.out.println("Your number is 3");
        }

        else {
            System.out.println("Invalid input");
        }

        scanner.close();
    }
}


// import java.util.Scanner;

// public class testElse {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Select a number : 1 / 2/ 3 ");
//         int word = scanner.nextInt();

//         if(word == 1) {
//             System.out.println("Your group is Blue");
//         }

//         else if(word == 2) {
//             System.out.println("Your group is Green");
//         }

//         else if(word == 3) {
//             System.out.println("Your group is Yellow");
//         }

//         else {
//             System.out.println("Invalid input");
//         }

//         scanner.close();
//     }
// }