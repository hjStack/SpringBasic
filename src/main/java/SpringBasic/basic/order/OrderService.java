package SpringBasic.basic.order;

public interface OrderService {

    //주문
    Order createOrder(Long id,String name,int itemPrice);
}
