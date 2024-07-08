package SpringBasic.basic;

import SpringBasic.basic.member.Member;
import SpringBasic.basic.member.MemberService;
import SpringBasic.basic.member.MemberServiceImpl;

public class memberApp {

    public static void main(String[] args) {
        MemberService memberService =new MemberServiceImpl();
         Member member=new Member(Grade.VIP,1L,"memberA");  //1L : 1 Long
         memberService.join(member);

         Member member1=memberService.findByMember(1L);
        System.out.println("find  Member = " +member1.getName());
        System.out.println("new member = "+member.getName());
    }
}
