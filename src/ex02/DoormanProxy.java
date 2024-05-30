package ex02;

public class DoormanProxy extends Doorman{

    public void getOut(Animal animal){
        System.out.println("지갑 검사");
        super.getOut(animal);
    }
}
