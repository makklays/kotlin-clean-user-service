package com.techmatrix18.userservice.infrastructure.persistence.entity

import jakarta.persistence.*
import java.util.*

/**
 * Entity class representing a user in the database.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
@Entity
@Table(name = "users")
class UserEntity(

    @Id
    val id: UUID,

    val email: String,

    val name: String,

    val password: String
)

