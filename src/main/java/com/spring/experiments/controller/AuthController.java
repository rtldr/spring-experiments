package com.spring.experiments.controller;

import com.google.firebase.auth.FirebaseAuthException;
import com.spring.experiments.service.AuthService;
import com.spring.experiments.service.request.VerifyTokenRequest;
import com.spring.experiments.service.response.VerifyTokenResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth/")
public class AuthController {


    @Autowired
    AuthService authService;

    @GetMapping("verify/email/{email}/token/{token}")
    public VerifyTokenResponse verifyToken(@PathVariable("email") String email,
                                           @PathVariable String token) throws FirebaseAuthException {
        System.out.println("Entered controller with email: " + email + ", tokenRequest: "
                + token);
        return authService.verifyToken(email, token);
    }
}
