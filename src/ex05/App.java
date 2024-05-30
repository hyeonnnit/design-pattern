package ex05;

public class App {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Doorman doorman = Doorman.instance;
        doorman.getOut(tiger);
    }
}
