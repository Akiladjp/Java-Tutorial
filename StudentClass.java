public class StudentClass {

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {

        StudentClass obj1 = new StudentClass();

        obj1.setName("Akila");
        System.out.println(obj1.getName());

        obj1.setAge(25);
        System.out.println(obj1.getAge());
    }
}
