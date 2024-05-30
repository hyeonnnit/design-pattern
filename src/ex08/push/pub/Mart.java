package ex08.push.pub;

import ex08.push.sub.Customer;

public interface Mart {
    // 1. 등록 (구독자 등록)
    void add(Customer customer);

    // 2. 출판 (유통업자에게 상품 받기, 야구 동영상 업로드) (바나나가 들어와야함)
    void receive();

    // 3. 알림 (구독자에게 알림)
    void notify(String msg);

    // 4. 구독 취소 (애는 필수 X)
    void remove(Customer customer);

}
