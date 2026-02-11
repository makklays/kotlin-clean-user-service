package com.techmatrix18.userservice.application.usecase

import com.techmatrix18.userservice.domain.exception.UserNotFoundException
import com.techmatrix18.userservice.domain.model.User
import com.techmatrix18.userservice.domain.repository.UserRepository
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

