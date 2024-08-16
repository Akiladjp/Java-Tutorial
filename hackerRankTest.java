import java.util.Scanner;

class HackerRankTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine();

        String[] array = new String[count];

        for (int x = 0; x < count; x++) {
            String query = in.nextLine();
            String[] parts = query.split(" ");

            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int n = Integer.parseInt(parts[2]);

            int ans = a;
            String finalAns = "";

            for (int i = 0; i < n; i++) {
                ans += (int) Math.pow(2, i) * b;
                finalAns += ans + " ";

            }
            array[x] = finalAns;
        }

        for(int y=0; y<array.length; y++) {
            System.out.println(array[y]);
        }

        in.close();
    }
}
