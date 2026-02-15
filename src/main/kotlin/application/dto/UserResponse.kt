package application.dto

import java.util.*

/**
 * Data Transfer Object representing a user response.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
data class UserResponse(
    val id: UUID,
    val name: String,
    val email: String
)

