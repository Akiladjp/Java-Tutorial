package Java_Exersices;

class AddComplexNum{
    int real;
    int rear;

    public AddComplexNum(int real, int rear) {
        this.real = real;
        this.rear = rear;
    }
    int getReal(){
        return real;
    }
    int getRear(){
        return rear;
    }
    void setReal(int real){
        this.real = real;
    }
    void setRear(int rear){
        this.rear = rear;
    }

    String finalAnswer(AddComplexNum num1, AddComplexNum num2){
        int finalReal = num1.getReal() + num2.getReal();
        int finalRear = num1.getRear() + num2.getRear();

        return "Final answer is : " + finalReal + " + " + finalRear + "i";
    }
}

public class ComplexNum {

    public static void main(String[] args) {

        AddComplexNum number1 = new AddComplexNum(1, 2);
        AddComplexNum number2 = new AddComplexNum(4, 5);

        AddComplexNum complexAdder = new AddComplexNum(0, 0);
        String result = complexAdder.finalAnswer(number1,number2);

        System.out.println(result);
    }

}
