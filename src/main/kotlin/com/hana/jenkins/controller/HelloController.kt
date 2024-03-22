package com.hana.jenkins.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun hello(): String {
        return "안녕"
    }
    @GetMapping("/hi")
    fun hi(): String {
        return "hi"
    }
}