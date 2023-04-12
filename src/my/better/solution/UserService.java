package my.better.solution;

import java.util.UUID;

class UserService {

    // ...

    void changeUsername(UUID userId, String updatedUsername) {
        User user = userRepository.getById();
        if (!user.canChangeUsername()) {
            // error handling logic here
        }
        user.changeUsername(updatedUsername);
        userRepository.save(user);
    }

}