package ac.weekly;

import java.util.List;
import java.util.Random;

public class Member {
    //- 요청 값에는 사용자 식별자가 포함됩니다.(= 메소드 파라미터에 사용자 식별값 전달된다.)
    //- 발급된 멤버십 바코드는 다른 사람과 중복될 수 없습니다.
    //- 다음번 발급될 멤버십 바코드가 예측 가능해서도 안됩니다.
    //- 이미 발급된 사용자로부터 발급 요청이 올 경우 기존 멤버십 바코드를 반환합니다.

    int memberId; // 사용자 식별자 (9자리)
    String barcode; // 멤버십 바코드 (10자리 숫자형 문자열)

    public Member(int memberId) {
        this.memberId = memberId; // 사용자 식별자값
        Random random = new Random();
        int ninebarcodeId = (int)(Math.random() * 899999999) + 100000000;
        // 바코드 값 중복체크는 어떻게..? db에서 확인하지 않고 어떻게 해야하지,,
        this.barcode = String.valueOf(ninebarcodeId); // 바코드값
    }



}
