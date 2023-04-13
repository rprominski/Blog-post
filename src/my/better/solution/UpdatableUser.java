package my.better.solution;

class UpdatableUser {
    private final User user;

    public UpdatableUser(User user) {
        this.user = user;
    }

    User changeUsername(String updatedUsername) {
        return new User(user.id(), updatedUsername, user.type());
    }
}
