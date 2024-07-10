
package SpringBasic.basic.order;

import SpringBasic.basic.discount.DiscountPolicy;
import SpringBasic.basic.discount.FixDiscountPolicy;
import SpringBasic.basic.member.Member;
import SpringBasic.basic.member.MemberRepository;
import SpringBasic.basic.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository,DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long id, String name, int itemPrice) {
        Member member = memberRepository.findById(id);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(id, name, itemPrice, discountPrice);
    }
}
