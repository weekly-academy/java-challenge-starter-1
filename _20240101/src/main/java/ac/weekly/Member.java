package ac.weekly;

import java.util.*;

public class Member {
//- 메소드 파라미터에는 사용자 식별자가 포함됩니다.
//- 사용자 식별자는 9자리 숫자를 사용합니다.
//  사용자 식별자는 중복될 수 없습니다.
//- 멤버십 바코드는 10자리 숫자형 문자열을 사용합니다.
//  발급된 멤버십 바코드는 다른 사람과 중복될 수 없습니다.
//  다음번 발급될 멤버십 바코드가 예측 가능해서도 안됩니다.
//- 이미 발급된 사용자로부터 발급 요청이 올 경우 기존 멤버십 바코드를 반환합니다.
    int memberId; // 사용자 식별자 (9자리)
    String barcode; // 멤버십 바코드 (10자리 숫자형 문자열)

    public Member(Integer memberId) { // 123456789

        Map<Integer, String> memberStorage = new HashMap<>(); // 사용자식별, 바코드 저장소
        String barcode = String.valueOf((int)(Math.random() * 899999999) + 1000000000);

        //////////////////이미 발급된 사용자일 경우 기존 바코드 값으로 수정///////////////////////
        if(memberStorage.containsKey(memberId)) { // 기존
            this.memberId = memberId;
            this.barcode = memberStorage.get(memberId);
            memberStorage.put(memberId, barcode);
        } else { // 신규
            this.memberId = (int)(Math.random() * 89999999) + 100000000;
            this.barcode = String.valueOf((int)(Math.random() * 899999999) + 1000000000);
            memberStorage.put(memberId, barcode);
        }
        System.out.println("memberStorage >> " + memberStorage);

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
