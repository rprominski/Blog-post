package my.better.solution;

import java.util.UUID;

import static my.better.solution.Require.require;

class User {
    private UUID id;
    private String username;
    private UserType type;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
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
