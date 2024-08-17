public class HackerRankTest3 {

    String name;
    HackerRankTest3() {
        System.out.println("welcome");
        name = "kamal";
    }

    void meth(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        HackerRankTest3 obj = new HackerRankTest3();
        System.out.println(obj.name);
        obj.meth();

    }

}
