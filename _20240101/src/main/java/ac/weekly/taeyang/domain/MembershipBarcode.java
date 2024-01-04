package ac.weekly.taeyang.domain;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class MembershipBarcode {
    private final String barcode;

    public MembershipBarcode() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        long randomizedBarcode = random.nextLong(100_000_000, 999_999_999);
        this.barcode = String.valueOf(randomizedBarcode);
    }

    public String getBarcode() {
        return barcode;
    }
}
