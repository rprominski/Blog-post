package my.better.solution;

import java.util.UUID;

class UserService {
    private final UserRepository userRepository;

    UserService(UserRepository repository) {
        this.userRepository = repository;
    }

    void changeUsername(UUID userId, String updatedUsername) {
        userRepository.getById(userId)
                .canChangeName()
                .map(updatableUser -> updatableUser.changeUsername(updatedUsername))
                .ifPresentOrElse(
                        userRepository::save,
                        () -> {
                            throw new UserUpdateFailed("I don't know, some error");
                        }
                );
    }
}