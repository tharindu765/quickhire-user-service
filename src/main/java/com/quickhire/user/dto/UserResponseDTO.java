package com.quickhire.user.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserResponseDTO {
    private Long id;
    private String email;
    private String fullName;
    private String role;

    @JsonProperty("resumeUrl")
    private String resumeUrl;

    @JsonProperty("logoUrl")
    private String logoUrl;
}