package ex09;

import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;

public class App {
    public static void main(String[] args) {
        HomeworkDelegator homeworkDelegator = new HomeworkDelegator();

        homeworkDelegator.delegateHomework(HomeworkType.MATH);

        homeworkDelegator.delegateHomework(HomeworkType.SCIENCE);
    }
}
