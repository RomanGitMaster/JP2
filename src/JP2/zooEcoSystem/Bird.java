package JP2.zooEcoSystem;

public class Bird extends Animal {
    @Override
    void displayInformation() {
        System.out.println("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats ");
    }

    @Override
    public void makesSound() {
        System.out.println("Bird makes sound");
    }
}


class Eagle extends Bird {
    @Override
    void displayInformation() {
        System.out.println("This is Eagle, bird with sharpest eyesight ");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats meat ");
    }

    @Override
    public void makesSound() {
        System.out.println("Eagle screams");
    }
}

class Parrot extends Bird {
    @Override
    void displayInformation() {
        System.out.println("This is Parrot, funny bird");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats grains");
    }

    @Override
    public void makesSound() {
        System.out.println("Parrot talks");
    }
}