package ac.weekly.taeyang.domain;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class User {
    private final int identifier;

    public User(int identifier) {
        this.identifier = identifier; // TODO 식별자 지정하는 방식 변경하기
    }

    public int getIdentifier() {
        return identifier;
    }
}
