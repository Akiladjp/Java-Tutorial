//class superClass {
//    int x = 10;
//}
//
//class childClass extends superClass {
//    int x = 15;
//
//    public void print(){
//        System.out.println(super.x);
//    }
//}
//
//public class Example {
//    public static void main(String[] args) {
//        childClass obj = new childClass();
//        System.out.println(obj.x);
//    }
//}

class Student {
    int age;
    String school;
    String email;

    Student(int age, String school, String email) {
        this.age = age;
        this.school = school;
        this.email = email;
    }
}

class Kamal extends Student {

    int marks;

    Kamal(int age, String school, String email, int marks) {

        super(age ,school, email);
        this.marks = marks;
    }
}

public class Example {
    public static void main(String[] args) {

        Kamal obj = new Kamal(25, "badulla", "abc@gmail.com", 82);
        System.out.println(obj.marks);
    }
}