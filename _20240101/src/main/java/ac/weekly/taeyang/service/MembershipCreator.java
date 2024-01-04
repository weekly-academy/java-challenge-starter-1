package ac.weekly.taeyang.service;

import ac.weekly.taeyang.domain.MembershipBarcode;
import ac.weekly.taeyang.domain.User;
import ac.weekly.taeyang.storage.MembershipBarcodeStorage;
import ac.weekly.taeyang.storage.UserStorage;

import java.util.Optional;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class MembershipCreator {
    private final MembershipBarcodeStorage membershipBarcodeStorage;
    private final MembershipBarcodeCreateValidator membershipBarcodeCreateValidator;
    private final UserStorage userStorage;

    public MembershipCreator(MembershipBarcodeStorage membershipBarcodeStorage, MembershipBarcodeCreateValidator membershipBarcodeCreateValidator, UserStorage userStorage) {
        this.membershipBarcodeStorage = membershipBarcodeStorage;
        this.membershipBarcodeCreateValidator = membershipBarcodeCreateValidator;
        this.userStorage = userStorage;
    }

    public MembershipBarcode createMembership(int userIdentifier) {
        // 기존에 가지고 있으면 기존 바코드 반환
        Optional<MembershipBarcode> userOwnedMembershipBarcode = membershipBarcodeStorage.getMembershipBarcode(userIdentifier);
        if (userOwnedMembershipBarcode.isPresent()) {
            return userOwnedMembershipBarcode.get();
        }

        // 기존에 가지고 있지 않으면 User 조회 + 새로운 바코드 생성
        User user = userStorage.getMemberByIdentifier(userIdentifier);
        MembershipBarcode membershipBarcode = new MembershipBarcode();

        boolean isValid = membershipBarcodeCreateValidator.validate(membershipBarcode);
        if (isValid) {
            membershipBarcodeStorage.add(user, membershipBarcode);
            return membershipBarcode;
        }

        throw new IllegalStateException("~~~ 이유로 오류가 발생했습니다.");
    }
}
