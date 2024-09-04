public class Test<T> {
    T[] arr = (T[]) new Object[3];

    public static void main(String[] args) {

        Test<Integer> obj = new Test();

        obj.arr[0] = 32;
    }
}
