package application.usecase

import domain.exception.UserNotFoundException
import domain.model.User
import domain.repository.UserRepository
import java.util.*

/**
 * Use case for retrieving a user by their ID.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
class GetUserUseCase(
    private val userRepository: UserRepository
) {

    fun execute(id: UUID): User {
        return userRepository.findById(id)
            ?: throw UserNotFoundException("User not found: $id")
    }
}

