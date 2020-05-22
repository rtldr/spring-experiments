package com.spring.experiments.service.response;

import lombok.Data;

import java.util.Map;

@Data
public class VerifyTokenResponse {
    private final String email;
    private final String issuer;
    private final String name;
    private final String uid;
    private final boolean isEmailVerified;
    private final Map<String, Object> claims;
}
