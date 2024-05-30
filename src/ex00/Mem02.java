package ex00;

abstract class Car {
    abstract void run();
}

class Sonata extends Car {
    @Override
    void run() {
        System.out.println("sonata running");
    }
}

class Genesis extends Car{
    @Override
    void run() {
        System.out.println("genesis running");
    }
}

public class Mem02 {
    public static void main(String[] args) {
        Car g = new Genesis();
        g.run();
        Car s = new Sonata();
        s.run();
    }
}