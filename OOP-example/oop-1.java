import java.util.Scanner;

class ArrayPrac {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter array's length");

        // int index = scanner.nextInt();

        // int [] num = new int [index];

        // System.out.println(num.length);

        // for( int i=0; i<num.length; i++) {

        //     num[i] = scanner.nextInt();
        // }

        // for(int a=0; a<num.length; a++){
        //     System.out.println("value of index " + a + "is " + num[a] );
        // }

        // for (int i = 0; i < num.length; i++) {
        //     System.out.println("Array element at index " + i + " is: " + num[i]);
        // }

        int [][] number = {{2,3,4}, {5,6,7, 8}, {2,3}};
        
        for(int i=0; i<number.length; i++ ) {
            for(int j=0; j<number[i].length; j++) {

                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
