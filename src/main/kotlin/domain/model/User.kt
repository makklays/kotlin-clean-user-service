package domain.model

import java.util.*

/**
 * Represents a user in the system.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
data class User(
    val id: UUID,
    val email: String,
    val name: String,
    val password: String
)

