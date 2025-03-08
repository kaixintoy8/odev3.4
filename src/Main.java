
//interface1
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("The bird flies in the sky.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("The airplane flies in the sky.");
    }
}
//interface2
interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}


public class Main {
    public static void main(String[] args) {
        //interface1

        Flyable bird = new Bird();
        bird.fly();
        Flyable airplane = new Airplane();
        airplane.fly();


        //interface2

        Drawable circle = new Circle();
        circle.draw();  // Drawing a circle.

        Drawable square = new Square();
        square.draw();  // Drawing a square.

    }
}
