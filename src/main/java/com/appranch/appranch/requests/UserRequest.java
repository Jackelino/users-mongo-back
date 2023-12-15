package com.appranch.appranch.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRequest {
    @JsonProperty("name")
    @NotBlank
    private String name;
    @NotBlank
    @JsonProperty("email")
    private String email;
}
