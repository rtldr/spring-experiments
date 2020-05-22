package com.spring.experiments.service.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VerifyTokenRequest {

    @JsonProperty("token")
    private final String token;
}
