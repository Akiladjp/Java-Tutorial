package OOPexample.abstraction;

public class Child extends Parent {
    
    void run(){
        System.out.println("Running");
    }

    void call(){

    }

    public static void main(String[] args) {
        
        Child C1 = new Child();
        C1.eat();
    }
}
