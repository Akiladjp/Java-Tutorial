package OOPexample;

abstract class Animal {
    String name;

    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method (implementation provided)
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Main {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();

        // Set the name of the Dog
        myDog.name = "Buddy";

        // Call the methods
        myDog.makeSound(); // Output: Bark
        myDog.eat();       // Output: Buddy is eating.
    }
}

