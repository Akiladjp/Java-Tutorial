class old_phone {

    String name;

    void call(){
        System.out.println("Call John");
    }

    void message(){
        System.out.println("Text John");
    }

    public static void main(String[] args) {

    }
}

class mid_phone extends  old_phone{

    void camera(){
        System.out.println("Launch camera");
    }

    public static void main(String[] args) {

    }
}

public class new_phone extends mid_phone {

    void internet(){
        System.out.println("Search news");
    }

    public static void main(String[] args) {

        new_phone obj2 = new new_phone();
        obj2.call();
        obj2.message();

        mid_phone obj3 = new mid_phone();
        obj3.camera();

        new_phone obj4 = new new_phone();
        obj4.internet();
    }
}