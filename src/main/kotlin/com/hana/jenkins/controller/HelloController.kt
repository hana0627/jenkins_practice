package com.hana.jenkins.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun hello(): String {
        return "안녕<br>반가워 젠킨스!!<br>커밋해볼게!"
    }
    @GetMapping("/hi")
    fun hi(): String {
        return "hi"
    }
}