package com.github.joostvdg.springbootadmin

import de.codecentric.boot.admin.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
open class SpringBootAdminApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringBootAdminApplication::class.java, *args)
}
