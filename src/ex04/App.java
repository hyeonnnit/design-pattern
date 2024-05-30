package ex04;

import ex04.teacher.JavaTeacher;
import ex04.teacher.Teacher;

public class App {
    public static void main(String[] args) {

        Animal tiger = new Tiger();
        Doorman doorman = Doorman.instance;
        doorman.getOut(tiger);
        Teacher jt = new JavaTeacher();
        jt.수업하기();
    }
}
