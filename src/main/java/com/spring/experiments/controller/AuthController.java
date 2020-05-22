package com.spring.experiments.controller;

import com.spring.experiments.service.request.VerifyTokenRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth/")
public class AuthController {

    @GetMapping("verify/email/{email}")
    public String verifyToken(@PathVariable("email") String email,
                              @RequestBody VerifyTokenRequest tokenRequest) {

        return null;
    }
}
