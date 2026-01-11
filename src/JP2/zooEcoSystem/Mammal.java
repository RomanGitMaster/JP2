package JP2.zooEcoSystem;

public class Mammal extends Animal {
    @Override
    void displayInformation() {
        System.out.println("Mammal");
    }

    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public void makesSound() {
        System.out.println("Mammal makes sound");
    }
}


class Lion extends Mammal{
    @Override
    void displayInformation() {
        System.out.println("This is the king of all animals on land");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void makesSound() {
        System.out.println("Lion roars");
    }
}


class Elephant extends Mammal{
    @Override
    void displayInformation() {
        System.out.println("This is the biggest animals on land");
    }

    @Override
    public void eat() {
        System.out.println("Elephant eats plants");
    }

    @Override
    public void makesSound() {
        System.out.println("Elephant horns");
    }
}