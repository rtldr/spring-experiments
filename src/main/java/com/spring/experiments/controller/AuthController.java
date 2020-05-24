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

    @GetMapping(value = "verify/email/{email}")
    public VerifyTokenResponse verifyToken(@PathVariable("email") String email,
                                           @RequestHeader("token") String token)
            throws FirebaseAuthException {

        System.out.println("Entered controller with email: " + email + ", token: "
                + token);
//        return authService.verifyToken(email, token);
        return null;
    }
}
