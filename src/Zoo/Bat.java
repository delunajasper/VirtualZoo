package Zoo;

public class Bat extends Animal implements Flyable {


    @Override
    public void eat() {
        System.out.println("Bats eat insect and fruits");
    }

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Bats fly");
    }
}
