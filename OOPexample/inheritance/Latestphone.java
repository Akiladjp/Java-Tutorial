package OOPexample.inheritance;

public class Latestphone extends Newphone {

    void camera(){

    }

    public static void main(String[] args) {
        
        Latestphone phone3 = new Latestphone();

        Newphone phone4 = new Latestphone();

        phone4.message();

        phone3.call();
        phone3.internet();
        phone3.camera();
    }
    
}
