package ex02;

public class App {
    public static void main(String[] args) {
        Animal mouse = new Mouse();
        Animal tiger = new Tiger();
//        DoormanProxy doorman = new DoormanProxy();
        DoormanProxy2 doorman = new DoormanProxy2(new Doorman());
        doorman.getOut(tiger);
    }
}
