package Zoo;

public class Monkey extends Animal implements Walkable {

    @Override
    public void eat() {
        System.out.println("Monkey loves Bananas!");
    }

    @Override
    public void move() {
        walk();
    }

    @Override
    public void walk() {
        System.out.println("Monkey walks");
    }
}
