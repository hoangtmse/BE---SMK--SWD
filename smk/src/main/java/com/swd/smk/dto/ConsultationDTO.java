package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultationDTO {

    private Long id;
    private MemberDTO member;
    private CoachDTO coach;
    private LocalDateTime consultationDate;
    private Float price;
    private String notes;
    private Status status;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
