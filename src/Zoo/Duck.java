package Zoo;

public class Duck extends Animal implements Walkable, Flyable, Swimmable {

    @Override
    public void eat() {
        System.out.println("Ducks eat grains and anything that moves");
    }

    @Override
    public void move() {
        walk();
        fly();
        swim();
    }

    @Override
    public void fly() {
        System.out.println("Ducks do fly");
    }

    @Override
    public void walk() {
        System.out.println("Ducks walk slowly");
    }

    @Override
    public void swim() {
        System.out.println("Ducks swim but floats all the time");
    }
}
