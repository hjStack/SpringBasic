package SpringBasic.basic.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(),member);  //put으로 키의 값을 저장  //객체 추가
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);  //get으로 키의 값 리턴  //객체 조회
    }
}
