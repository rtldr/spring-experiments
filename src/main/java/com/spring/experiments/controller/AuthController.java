package com.spring.experiments.controller;

import com.spring.experiments.service.AuthService;
import com.spring.experiments.service.request.VerifyTokenRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth/")
public class AuthController {


    @Autowired
    AuthService authService;

    @GetMapping("verify/email/{email}")
    public String verifyToken(@PathVariable("email") String email,
                              @RequestBody VerifyTokenRequest tokenRequest) {

        return authService.verifyToken(email, tokenRequest);
    }
}
