package com.techmatrix18.userservice.infrastructure.web.controller

import com.techmatrix18.userservice.application.usecase.CreateUserUseCase
import com.techmatrix18.userservice.application.usecase.GetUserUseCase
import org.springframework.web.bind.annotation.*
import java.util.*

/**
 * REST controller for managing users in the system.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
@RestController
@RequestMapping("/users")
class UserController(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase
) {

    @PostMapping
    fun create(@RequestParam email: String,
               @RequestParam name: String) =
        createUserUseCase.execute(email, name)

    @GetMapping("/{id}")
    fun get(@PathVariable id: UUID) =
        getUserUseCase.execute(id)
}

