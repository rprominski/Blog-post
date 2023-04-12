package my.better.solution;

import java.util.UUID;

class User {
    private UUID id;
    private String username;
    private UserType type;

    // ...

    UserType getType() {
        return type;
    }

    boolean canChangeUsername() {
        return type == UserType.PAYING;
    }

    void changeUsername(String updatedUsername) {
        // fails if not met! (domain assertion)
        require(canChangeUsername(), "Illegal username change");

        this.username = updatedUsername;
    }
}
