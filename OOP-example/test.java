// class test {

//     String name;
//     String color;
//     int ram;

//     public void call() {
//         System.out.println("Call from "+name);
//     }

//     public String text(String brand) {
//         return "Call me from " + brand;
//     }
//     public static void main(String[] args) {

//         test phone1 = new test();
//         phone1.name = "Samsung";
//         System.out.println(phone1.text("Apple"));
//         phone1.call();
//     }
// }

// class Parent {

//     public static void main(String[] args) {

//         String str1 = new String("Hello");
//         String str2 = new String("Akila");

//         System.out.println(str1 == str2);

//     }
// }


class Rectangle {
    
    private double width;
    private double height;

    Rectangle(){
        width = 1;
        height = 1;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    void set_width(double width){
        this.width = width;
    }

    void set_height(double height){
        this.height = height;
    }

    double get_width(){
        return width;
    }

    double get_height(){
        return height;
    }

    double get_Area(){
        return height * width;
    }
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(12, 7);
        System.out.println(rectangle.get_height());
        System.out.println(rectangle.get_width());

        System.out.println("Area is "+ rectangle.get_Area());
    }
}