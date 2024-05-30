package ex08.polling;

public class App {
    public static void main(String[] args) {
        LotteMart lotteMart = new LotteMart();
        Customer1 customer1 = new Customer1();

        new Thread(() -> {
            lotteMart.received();
        }).start();

//        while (true) {
//            String call = lotteMart.getValue();
//            System.out.println(call);
//
//            if (call != null) break;
//
//        }

        // 2. 손님 1 (손님 스레드 == main 스레드)
//        while (true) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            String call = lotteMart.getValue();
//            System.out.println(call);
//
//            if (call != null) break;
//
//        }

        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (lotteMart.getValue() != null) {
                customer1.update(lotteMart.getValue() + "이 들어왔습니다");
            } else {
                System.out.println("상품이 아직 들어오지 않았습니다.");
            }

        }
    }
}
