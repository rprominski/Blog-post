package my.better.solution;

import java.util.UUID;

class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    void changeUsername(UUID userId, String updatedUsername) {
        User user = userRepository.getById(userId);
        if (!user.canChangeUsername()) {
            // error handling logic here
        }
        user.changeUsername(updatedUsername);
        userRepository.save(user);
    }
}