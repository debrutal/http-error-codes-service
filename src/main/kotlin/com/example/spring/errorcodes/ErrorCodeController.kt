package com.example.spring.errorcodes

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class ErrorCodeController {

    @GetMapping("/{code}")
    fun getErrorCode(@PathVariable code: String): ResponseEntity<String> {
        return ResponseEntity("Created Response Code: $code",HttpStatus.valueOf(Integer.parseInt(code)))
    }
}