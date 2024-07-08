package SpringBasic.basic.member;

public class MemberServiceImpl implements MemberService{

    private static memberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findByMember(Long MemberId) {
        return memberRepository.findById(MemberId);
    }


}
