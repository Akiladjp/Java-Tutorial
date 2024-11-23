package OOPexample;

class Parent {
    protected String gurdian_name;

    Parent(String gurdian_name) {
        this.gurdian_name = gurdian_name;
    }

    void setName(String gurdian_name) {
        this.gurdian_name = gurdian_name;
    }

    String getGurdianName() {
        return "Guardian name is " + gurdian_name;
    }
}

class Child extends Parent {

    String name;
    int accNum;
    String parent;
    double balance;

    Child(String name, int accNum, String parent, double balance, String gurdian_name) {
        super(gurdian_name);
        this.name = name;
        this.accNum = accNum;
        this.parent = parent;
        this.balance = balance;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    void setParent(String parent) {
        this.parent = parent;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    String getName() {
        return "Acc holder name is " + name;
    }

    String getAccNum() {
        return "Acc Num is " + accNum;
    }

    String getParent() {
        return "Parent name is " + parent;
    }

    String getBalance() {
        return "Account balance is " + balance;
    }

    String all() {
        return getAccNum() + "\n" +
               getBalance() + "\n" +
               getName() + "\n" +
               getParent() + "\n" +
               getGurdianName();
    }
}

class Test {
    public static void main(String[] args) {

        Child child1 = new Child("Kamal", 1212, "Nimal", 1223.75, "Grandparents");
        System.out.println(child1.all());
    }
}
