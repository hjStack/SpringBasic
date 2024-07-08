package SpringBasic.basic.member;

public interface MemberService  {

    //회원 가입 , 회원 조회

    public void join(Member member);
    Member findByMember(Long MemberId);
}
