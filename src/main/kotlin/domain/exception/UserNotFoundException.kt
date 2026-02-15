package domain.exception

/**
 * Exception thrown when a user is not found in the system.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
class UserNotFoundException(message: String) : RuntimeException(message)

