public class arrayNew {

    public static void main(String[] args) {

//        int [] numbers = {1, 2, 3, 4, 5};
//
//        System.out.println(numbers[0]);

//        int [] numbers = new int[5];
//        numbers [0] = 1;
//        numbers [1] = 2;
//        numbers [2] = 4;
//
//        System.out.println(numbers[2]);

        int[][] numbers = {
                {1, 2, 3},
                {2, 4, 5}
        };

        try {
            for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers[i].length; j++) {
                    System.out.println(numbers[i][j]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }

    }
}
