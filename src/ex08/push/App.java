package ex08.push;

import ex08.push.pub.LotteMart;
import ex08.push.pub.Mart;
import ex08.push.sub.Cus1;
import ex08.push.sub.Cus2;

public class App {
    public static void main(String[] args) {
        Mart lotteMart = new LotteMart();
        Cus1 cus1 = new Cus1();
        Cus2 cus2 = new Cus2();

        lotteMart.add(cus1);
        lotteMart.add(cus2);

        lotteMart.remove(cus2);

        lotteMart.receive();
    }
}
