package SpringBasic.basic;

import SpringBasic.basic.member.Member;
import SpringBasic.basic.member.MemberService;
import SpringBasic.basic.member.MemberServiceImpl;
import SpringBasic.basic.order.Order;
import SpringBasic.basic.order.OrderService;
import SpringBasic.basic.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService=new MemberServiceImpl();
    OrderService orderService=new OrderServiceImpl();

    @Test
    void createOrder(){

        //given
        Long memberId=1L;
        Member member=new Member(Grade.VIP,memberId,"memberA");

        //when
        memberService.join(member);

        Order order=orderService.createOrder(memberId,"itemA",10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }

}
