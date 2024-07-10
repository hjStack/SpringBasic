package SpringBasic.basic;


import SpringBasic.basic.member.Member;
import SpringBasic.basic.member.MemberService;
import SpringBasic.basic.member.MemberServiceImpl;
import SpringBasic.basic.order.Order;
import SpringBasic.basic.order.OrderService;
import SpringBasic.basic.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {

        MemberService memberService=new MemberServiceImpl();
        OrderService orderService=new OrderServiceImpl();

        long memberId=1L;
        Member member=new Member(Grade.VIP,memberId,"memberA");
        memberService.join(member);

        Order order=new Order(memberId,"itemA",10000,1000);

        System.out.println("order = " + order);
    }

}
