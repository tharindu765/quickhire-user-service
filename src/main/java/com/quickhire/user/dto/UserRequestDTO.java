package com.quickhire.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestDTO {
    private String email;
    private String password;
    private String fullName;
    private String role;

    @JsonProperty("resumeUrl")
    private String resumeUrl;

    @JsonProperty("logoUrl")
    private String logoUrl;
}