package com.techmatrix18.userservice.infrastructure.messaging

import com.techmatrix18.userservice.domain.model.User
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Component
import java.util.*

/**
 * Component responsible for publishing user-related events to the application context.
 * Компонент для публикации событий о пользователях
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
@Component
class UserEventPublisher(
    private val publisher: ApplicationEventPublisher
) {

    // Пример события: пользователь создан
    fun publishUserCreated(user: User) {
        val event = UserCreatedEvent(this, user.id, user.name)
        publisher.publishEvent(event)
    }
}

// Класс события
data class UserCreatedEvent(
    val source: Any,
    val userId: UUID,
    val userName: String
)

