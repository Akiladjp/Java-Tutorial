package OOPexample;

class Rectangle {

    private double width;
    private double height;

    Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    double getArea(){
        double area = width * height;
        return area;
    }
}

class Test {

    public static void main(String[] args) {
        
        Rectangle R1 = new Rectangle(12, 5);
        System.out.println("Area is "+ R1.getArea());
    }
}