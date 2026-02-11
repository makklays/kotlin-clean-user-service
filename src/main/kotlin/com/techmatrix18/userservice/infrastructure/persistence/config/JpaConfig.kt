package com.techmatrix18.userservice.infrastructure.persistence.config

import jakarta.persistence.EntityManagerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.JpaTransactionManager
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter
import javax.sql.DataSource

/**
 * Configuration class for setting up JPA with Hibernate as the provider.
 *
 * @author Alexander Kuziv <makklays@gmail.com>
 * @company TechMatrix18
 * @since 11.02.2026
 * @version 0.0.1
 */
@Configuration
class JpaConfig {

    @Bean
    fun entityManagerFactory(dataSource: DataSource): LocalContainerEntityManagerFactoryBean {
        val em = LocalContainerEntityManagerFactoryBean()
        em.dataSource = dataSource
        em.setPackagesToScan("com.techmatrix18.userservice.infrastructure.persistence.entity")
        em.jpaVendorAdapter = HibernateJpaVendorAdapter()
        return em
    }

    @Bean
    fun transactionManager(entityManagerFactory: EntityManagerFactory): JpaTransactionManager {
        return JpaTransactionManager(entityManagerFactory)
    }
}
