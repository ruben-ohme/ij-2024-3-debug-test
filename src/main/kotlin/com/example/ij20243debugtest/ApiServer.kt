package com.example.ij20243debugtest

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import javax.annotation.PostConstruct

fun main(args: Array<String>) {
    SpringApplication.run(ApiServer::class.java, *args)
}

@SpringBootApplication
open class ApiServer : SpringBootServletInitializer() {

    init {
        println("ApiServer init")
    }

    @PostConstruct
    fun onStartup() {
        println("ApiServer onStartup")
    }
}

