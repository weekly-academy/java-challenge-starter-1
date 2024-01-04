package ac.weekly.taeyang.service;

import ac.weekly.taeyang.domain.MembershipBarcode;
import ac.weekly.taeyang.storage.MembershipBarcodeStorage;

import java.util.Optional;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class MembershipBarcodeCreateValidator {

    private final MembershipBarcodeStorage membershipBarcodeStorage;

    public MembershipBarcodeCreateValidator(MembershipBarcodeStorage membershipBarcodeStorage) {
        this.membershipBarcodeStorage = membershipBarcodeStorage;
    }

    public boolean validate(MembershipBarcode membershipBarcode) {
        Optional<MembershipBarcode> existMembershipBarcode = membershipBarcodeStorage.getMembershipBarcode(membershipBarcode);
        if (existMembershipBarcode.isPresent()) {
            throw new IllegalArgumentException("이미 존재하는 멤버십 바코드입니다.");
        }
        return true;
    }
}
