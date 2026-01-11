package JP2.zooEcoSystem;

public interface AnimalBehavior {
    void eat();
    void sleep();
    void makesSound();

}
abstract class Animal implements AnimalBehavior{
    public void sleep(){
        System.out.println("Animal sleeps");
    }
    abstract void displayInformation();
}
