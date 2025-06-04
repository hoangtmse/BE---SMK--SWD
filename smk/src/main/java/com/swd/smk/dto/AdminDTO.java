package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Role;
import com.swd.smk.enums.Status;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminDTO {
    private Long id;
    private String username;
    private String password;
    private Role role;
    private Status status;
}
