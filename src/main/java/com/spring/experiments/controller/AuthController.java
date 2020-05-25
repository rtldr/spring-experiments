package com.spring.experiments.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthController {

    private String SUCCESS = "Successfully verified";

    @GetMapping(value = "verify/email/{email}")
    public String verifyToken(@PathVariable("email") String email) {
        return SUCCESS;
    }

    @GetMapping(value = "verify/email/{email}/id/{id}")
    public String verifyTokenAndId(@PathVariable("email") String email,
                                                @PathVariable("id") String id) {

        return SUCCESS;
    }
}
