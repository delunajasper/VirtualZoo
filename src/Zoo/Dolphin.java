package Zoo;

public class Dolphin extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Dolphin swims");
    }

    @Override
    public void eat() {
        System.out.println("Dolphins eat fish");
    }

    @Override
    public void move() {
        swim();
    }
}
