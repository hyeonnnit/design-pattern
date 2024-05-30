package ex05;

public class Doorman {
    public static Doorman instance = new Doorman();
    private Doorman(){}
    public void getOut(Animal animal){
        System.out.println(animal.getName() +"를 쫓아내");
    }
}
