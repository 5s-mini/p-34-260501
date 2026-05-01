package com.back

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
object RestApiApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(RestApiApplication::class.java, *args)
    }
}