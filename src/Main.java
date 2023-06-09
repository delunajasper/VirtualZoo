import Zoo.*;

public class Main {
    public static void main(String[] args) {

       var duck = new Duck();
       duck.eat();
       duck.move();

       var bat = new Bat();
       bat.eat();
       bat.move();

       var penguin = new Penguin();
       penguin.eat();
       penguin.move();

       var dolphin = new Dolphin();
       dolphin.eat();
       dolphin.move();

       var monkey = new Monkey();
       monkey.move();
       monkey.eat();
    }
}