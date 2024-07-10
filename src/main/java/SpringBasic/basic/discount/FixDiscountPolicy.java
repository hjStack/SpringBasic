package SpringBasic.basic.discount;

import SpringBasic.basic.Grade;
import SpringBasic.basic.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy {

    //등급에 관계없이 무조건 1000원 할인

    private int discountFixAmount=1000;

    @Override
    public int discount(Member member, int price) {
       if(member.getGrade() == Grade.VIP){
           return discountFixAmount;
       }
       else{
           return 0;
       }
    }
}
