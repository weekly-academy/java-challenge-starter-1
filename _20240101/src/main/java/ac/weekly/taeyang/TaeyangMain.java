package ac.weekly.taeyang;

import ac.weekly.taeyang.domain.MembershipBarcode;
import ac.weekly.taeyang.domain.User;
import ac.weekly.taeyang.service.MembershipBarcodeCreateValidator;
import ac.weekly.taeyang.service.MembershipCreator;
import ac.weekly.taeyang.storage.MembershipBarcodeStorage;
import ac.weekly.taeyang.storage.UserStorage;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class TaeyangMain {
    public static void main(String[] args) {
        User user = new User(100_000_000);

        // TODO 유저 생성: 별도 기능으로 고도화
        MembershipBarcodeStorage membershipBarcodeStorage = new MembershipBarcodeStorage();
        UserStorage userStorage = new UserStorage();
        userStorage.add(user);

        MembershipBarcodeCreateValidator membershipBarcodeCreateValidator = new MembershipBarcodeCreateValidator(membershipBarcodeStorage);
        MembershipCreator membershipCreator = new MembershipCreator(membershipBarcodeStorage, membershipBarcodeCreateValidator, userStorage);
        MembershipBarcode newMembershipBarcode = membershipCreator.createMembership(user.getIdentifier());

        System.out.println(newMembershipBarcode.getBarcode()); // 바코드 -> 랜덤

        MembershipBarcode existMembershipBarcode = membershipCreator.createMembership(user.getIdentifier());
        System.out.println(existMembershipBarcode.getBarcode()); // 위랑 똑같은 출력
    }
}
