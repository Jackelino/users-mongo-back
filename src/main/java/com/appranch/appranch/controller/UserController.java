package com.appranch.appranch.controller;

import com.appranch.appranch.dao.UserInterface;
import com.appranch.appranch.models.User;
import com.appranch.appranch.requests.UserRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserInterface userInterface;

    public UserController(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(this.userInterface.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@Valid @RequestBody UserRequest userRequest, BindingResult result) {
        User user = this.userInterface.save(userRequest);
        return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }
}
