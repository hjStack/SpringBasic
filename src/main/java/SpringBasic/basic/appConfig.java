package SpringBasic.basic;

import SpringBasic.basic.discount.DiscountPolicy;
import SpringBasic.basic.discount.FixDiscountPolicy;
import SpringBasic.basic.member.MemberService;
import SpringBasic.basic.member.MemberServiceImpl;
import SpringBasic.basic.member.MemoryMemberRepository;
import SpringBasic.basic.order.OrderService;
import SpringBasic.basic.order.OrderServiceImpl;

public class appConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }
}
