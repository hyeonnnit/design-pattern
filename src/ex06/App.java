package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;

public class App {
    public static void main(String[] args) {
//        Notifier basicNotifier = new BasicNotifier();
//        basicNotifier.send();
        Notifier emailNotifier = new EmailNotifier(new BasicNotifier());
        emailNotifier.send();
    }
}
