package my.better.solution;

class Require {
    static void require(boolean precondition, String errorMessage) {
        if (!precondition) {
            throw new DomainPreconditionFailed(errorMessage);
        }
    }
}
