package application.usecase

import domain.repository.UserRepository
import domain.model.User
import domain.exception.UserNotFoundException
import java.util.UUID

/**
 * Use case for deleting a user from the system.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
class DeleteUserUseCase(private val userRepository: UserRepository) {

    fun execute(id: UUID) {
        val user: User = userRepository.findById(id)
            ?: throw UserNotFoundException("User with id $id not found")
        userRepository.delete(user)
    }
}

