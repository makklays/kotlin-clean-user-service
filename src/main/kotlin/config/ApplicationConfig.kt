package config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.UUID

/**
 * Application configuration class for defining beans and application-wide settings.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
@Configuration
class ApplicationConfig {

    // Пример бина — генератор UUID, чтобы его можно было инжектить
    @Bean
    fun uuidGenerator(): () -> UUID = { UUID.randomUUID() }

    // Можно добавить другие бины, например, ObjectMapper или настройки сериализации
    /*
    @Bean
    fun objectMapper(): ObjectMapper {
        return ObjectMapper().registerModule(KotlinModule())
    }
    */
}

