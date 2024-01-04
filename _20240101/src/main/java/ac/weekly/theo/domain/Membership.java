package ac.weekly.theo.domain;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class Membership {

    private final User user;
    private final MembershipBarcode membershipBarcode;

    public Membership(User user, MembershipBarcode membershipBarcode) {
        this.user = user;
        this.membershipBarcode = membershipBarcode;
    }
}
