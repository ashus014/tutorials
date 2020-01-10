/**
 * Animal
 */
 
public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }    
}

------------------------------------------------------------------------

/**
 * Dog
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void breathe() {
        System.out.println("breathe...breathe...breathe...");

    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");

    }
}

-----------------------------------------------------------------------------

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Bolto");
        dog.breathe();
        dog.eat();
    }
}

    
