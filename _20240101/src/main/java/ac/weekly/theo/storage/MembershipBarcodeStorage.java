package ac.weekly.theo.storage;

import ac.weekly.theo.domain.MembershipBarcode;
import ac.weekly.theo.domain.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class MembershipBarcodeStorage {
    private final Map<Integer, MembershipBarcode> membershipBarcodes = new HashMap<>();

    public void add(User user, MembershipBarcode membershipBarcode) {
        membershipBarcodes.put(user.getIdentifier(), membershipBarcode);
    }

    public Optional<MembershipBarcode> getMembershipBarcode(MembershipBarcode membershipBarcode) {
        return membershipBarcodes.values().stream()
                .filter(existMembershipBarcode -> Objects.equals(existMembershipBarcode.getBarcode(), membershipBarcode.getBarcode()))
                .findFirst();
    }

    public Optional<MembershipBarcode> getMembershipBarcode(int userIdentifier) {
        return Optional.ofNullable(membershipBarcodes.get(userIdentifier));
    }
}
