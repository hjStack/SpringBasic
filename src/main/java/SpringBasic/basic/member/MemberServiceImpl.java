package SpringBasic.basic.member;

public class MemberServiceImpl implements MemberService{

    private static MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository=memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findByMember(Long MemberId) {
        return memberRepository.findById(MemberId);
    }

}
