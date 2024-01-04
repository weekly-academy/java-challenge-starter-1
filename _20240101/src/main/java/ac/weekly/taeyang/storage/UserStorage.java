package ac.weekly.taeyang.storage;

import ac.weekly.taeyang.domain.User;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Theo
 * @since 2024/01/04
 */
public class UserStorage {
    private final Collection<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public User getMemberByIdentifier(int identifier) {
        return users.stream()
                .filter(user -> user.getIdentifier() == identifier)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자 식별자입니다."));
    }
}
