package OOPexample.abstraction;

public class Kamal implements Student{
    
    public void eat(){
        System.out.println("Eating");
    }

    public void drink(){
        System.out.println("Drinking");
    }

    public void walk(){
        System.out.println("Walking");
    }

    public static void main(String[] args) {
        
        Kamal S1 = new Kamal();
        S1.drink();
    }
}
