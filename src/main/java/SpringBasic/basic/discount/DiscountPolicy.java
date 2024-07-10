package SpringBasic.basic.discount;

import SpringBasic.basic.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
