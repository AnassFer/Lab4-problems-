package problem7;

// Abstract base class
abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void display();
}

// Carpenter class extending Person
class Carpenter extends Person {
    public Carpenter(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("My name is " + name + " and I am a carpenter.");
    }
}

// Plumber class extending Person
class Plumber extends Person {
    public Plumber(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("My name is " + name + " and I am a plumber.");
    }
}
