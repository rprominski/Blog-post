package my.better.solution;

import java.util.UUID;

interface UserRepository {
    User getById(UUID userId);

    void save(User user);
}
