package SpringBasic.basic.member;

public interface memberRepository {

    void save(Member member);
    Member findById(Long memberId);
}
