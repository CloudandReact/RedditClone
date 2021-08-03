package com.example.RedditBackend.controller;

import com.example.RedditBackend.dto.AuthenticationResponse;
import com.example.RedditBackend.dto.LoginRequest;
import com.example.RedditBackend.dto.RegisterRequest;
import com.example.RedditBackend.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody RegisterRequest registerRequest){
        authService.signup(registerRequest);
        return new ResponseEntity<>("User Registration Successfull", HttpStatus.OK);

    }
    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token ){
        authService.veifyAccount(token);
        return new ResponseEntity<>("Account activated succesfully",HttpStatus.OK);
    }
    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest){
       return authService.login(loginRequest);
    }
}
