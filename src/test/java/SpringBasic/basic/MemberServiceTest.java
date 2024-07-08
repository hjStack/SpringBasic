package SpringBasic.basic;

import SpringBasic.basic.member.Member;
import SpringBasic.basic.member.MemberService;
import SpringBasic.basic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {

    MemberService memberService=new MemberServiceImpl() ;

    @Test
     void join(){
        //given
        Member member=new Member(Grade.VIP,1L,"memberA");  //1L : 1 Long

        //when
        memberService.join(member);
        Member findMember = memberService.findByMember(1L);

        //then  //검증은 = assertions.assertThat().isEqualTo();
        
        Assertions.assertThat(member).isEqualTo(findMember);
    }


}
