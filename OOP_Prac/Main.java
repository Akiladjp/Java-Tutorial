package OOP_Prac;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many rectangles do you want to enter?");
        int count = input.nextInt();
        Rectangle[] rectangles = new Rectangle[count];

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Do you want to enter height and width for rectangle " + (i + 1) + "? (y/n)");

            char choice = input.next().charAt(0);

            if (choice == 'y') {
                System.out.println("Enter height and width (e.g., 2.5 4.0): ");
                rectangles[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            } else if (choice == 'n') {
                rectangles[i] = new Rectangle();
            } else {
                System.out.println("Invalid input! Using default dimensions.");
                rectangles[i] = new Rectangle();
            }
        }

        for (int i = 0; i < rectangles.length; i++) {
//            System.out.println("Rectangle " + (i + 1) + ": " + rectangles[i].getWidth() + " x " + rectangles[i].getHeight());
            System.out.println("Area is " + rectangles[i].getArea());
        }

        input.close();
    }
}
