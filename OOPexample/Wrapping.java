package OOPexample;

// public class Wrapping {

//     int x = 12;
//     Integer y = Integer.valueOf(x);
//     Integer z = x;

//     int b = z.intValue();
//     int c = z;
// }

class Test {

    void reverse() {

        String word = " Akila Piyumal ";
        word = word.toLowerCase();

        // System.out.println(word.charAt(1));

        String noSpaces = word.replaceAll("\\s+", ""); // remove all spaces

        System.out.println(noSpaces);

        String reverse = "";

        for (int i = word.length() - 1; 0 <= i; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse);

    }

    void duplicate() {

        int[] array = { 1, 2, 3, 2, 3, 1};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + " = duplicated ");
                }
            }
        }
    }


    void palindrome(){

        String word = "Asdsa";
        String wordLower = word.toLowerCase();

        String reverse = "";

        for(int i=wordLower.length()-1; 0<=i; i--){

            reverse += wordLower.charAt(i);
        }

        if (reverse.equals(wordLower)) {
            System.out.println(word + " is Palandrome");
        }
        else {
            System.out.println(word + " is not Palandrome");
        }
    }

    void substring(){

        String word = "HelloWorld";

        String sub = word.substring(2,7);

        System.out.println(sub);
    }

    public static void main(String[] args) {

        Test R1 = new Test();
        R1.palindrome();
        R1.substring();
    }
}
