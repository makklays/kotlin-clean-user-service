package application.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

/**
 * Data class representing the request body for creating a new user.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
data class CreateUserRequest (
    @field:NotBlank val name: String,
    @field:Email val email: String,
    @field:NotBlank val password: String
)

