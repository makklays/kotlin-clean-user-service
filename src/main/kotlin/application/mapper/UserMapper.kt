package application.mapper

import domain.model.User
import infrastructure.persistence.entity.UserEntity
import application.dto.CreateUserRequest
import application.dto.UserResponse
import java.util.*

/**
 * Mapper object for converting between User domain models, entities, and DTOs.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
object UserMapper {

    // DTO -> Domain
    fun fromRequest(request: CreateUserRequest): User {
        return User(
            id = UUID.randomUUID(), // генерируем новый UUID
            name = request.name,
            email = request.email,
            password = request.password
        )
    }

    // Domain -> DTO
    fun toResponse(user: User): UserResponse {
        return UserResponse(
            id = user.id,
            name = user.name,
            email = user.email
        )
    }

    // Domain -> Entity
    fun toEntity(user: User): UserEntity {
        return UserEntity(
            id = user.id,
            name = user.name,
            email = user.email,
            password = user.password
        )
    }

    // Entity -> Domain
    fun fromEntity(entity: UserEntity): User {
        return User(
            id = entity.id,
            name = entity.name,
            email = entity.email,
            password = entity.password
        )
    }
}

