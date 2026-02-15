package domain.repository

import domain.model.User
import java.util.*

/**
 * Repository interface for managing User entities.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
interface UserRepository {
    fun save(user: User): User
    fun findById(id: UUID): User?
    fun delete(user: User)
}

