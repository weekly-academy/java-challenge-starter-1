package ac.weekly.js;

import java.util.ArrayList;
import java.util.List;

//1. 사용자 식별자와 바코드를 연결해주는 클래스
// 2. 여태 발급된 바코드 목록을 관리하는 클래스
// 3. 신규 바코드를 발급하는 클래스

public class Member {
//- 메소드 파라미터에는 사용자 식별자가 포함됩니다.
//- 사용자 식별자는 9자리 숫자를 사용합니다.
//  사용자 식별자는 중복될 수 없습니다.

    //- 멤버십 바코드는 10자리 숫자형 문자열을 사용합니다.
//  발급된 멤버십 바코드는 다른 사람과 중복될 수 없습니다.
//  다음번 발급될 멤버십 바코드가 예측 가능해서도 안됩니다.
//- 이미 발급된 사용자로부터 발급 요청이 올 경우 기존 멤버십 바코드를 반환합니다.
    Integer memberId; // 사용자 식별자 (9자리)
    Barcode barcodeTemp = new Barcode();
    String barcode = String.valueOf(barcodeTemp.getBarcode()); // 바코드
    List<Integer> memberList = new ArrayList<>();

    public Member(Integer memberId) {
        if (!memberList.contains(memberId)) { // 바코드
            this.memberId = memberId;
            this.barcode = barcode;
            memberList.add(memberId);
        }
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
