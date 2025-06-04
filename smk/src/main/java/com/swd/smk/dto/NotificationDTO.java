package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NotificationDTO {
    private Long id;
    private MemberDTO member;
    private String message;
    private LocalDateTime sentDate;
    private Status status;
}
