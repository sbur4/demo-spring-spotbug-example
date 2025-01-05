package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class Controller {
    @PostMapping("/create/{name}")
    public ResponseEntity<String> createUser(@PathVariable("name") String name) {
        log.info("Attempting to create a new user with name: {}", name);
        return ResponseEntity.ok(name);
    }
}