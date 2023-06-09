package Zoo;

public class Penguin extends Animal implements Swimmable {

    @Override
    public void eat() {
        System.out.println("Penguins eats fish");
    }

    @Override
    public void move() {
        swim();
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }
}
