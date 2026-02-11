# Kotlin clean user microservice 

This is a project in Kotlin with Spring Boot, etc. 

I implemented a microservice using Kotlin and Clean Architecture principles with Hexagonal structure.

I want to demonstrate in this project my knowledge, such as:
- REST API
- CRUD
- DTO
- Mapper
- Validation
- Exception handling
- PostgreSQL
- Flyway
- Docker
- Kubernetes
- JWT
- Clean / Hexagonal Architecture

#### And next tech stack:
- Kotlin
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Flyway
- Docker
- Testcontainers
- JUnit 5

<pre>
src/main/kotlin/com/techmatrix18/userservice

├── domain
│   ├── model
│   │   └── User.kt
│   ├── repository
│   │   └── UserRepository.kt
│   └── exception
│       └── UserNotFoundException.kt
│
├── application
│   ├── usecase
│   │   ├── CreateUserUseCase.kt
│   │   └── GetUserUseCase.kt
│   └── dto
│       ├── CreateUserRequest.kt
│       └── UserResponse.kt
│
├── infrastructure
│   ├── persistence
│   │   ├── entity
│   │   │   └── UserEntity.kt
│   │   ├── repository
│   │   │   └── JpaUserRepository.kt
│   │   ├── config/
│   │   │   └── JpaConfig.kt
│   │   ├── SpringDataUserRepository.kt
│   │   └── UserRepositoryAdapter.kt
│   │
│   └── web
│       └── UserController.kt
│
└── UserServiceApplication.kt
</pre>

