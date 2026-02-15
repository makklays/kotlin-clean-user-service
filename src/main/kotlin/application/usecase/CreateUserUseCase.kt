package application.usecase

import domain.model.User
import domain.repository.UserRepository
import java.util.*

/**
 * Use case for creating a new user in the system.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
class CreateUserUseCase(
    private val userRepository: UserRepository
) {

    fun execute(email: String, name: String): User {
        val user = User(
            id = UUID.randomUUID(),
            email = email,
            name = name,
            password = "default_password" // In a real application, you would hash the password and not use a default value
        )
        return userRepository.save(user)
    }
}

