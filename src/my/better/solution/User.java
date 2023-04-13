package my.better.solution;

import java.util.Optional;
import java.util.UUID;

record User(UUID id, String username, UserType type) {
    Optional<UpdatableUser> canChangeName() {
        if (type == UserType.PAYING) {
            return Optional.of(new UpdatableUser(this));
        }
        return Optional.empty();
    }
}