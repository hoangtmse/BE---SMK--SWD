package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanDTO {

    private Long id;
    private MemberDTO member;
    private String reason;
    private String phases;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate Start_Date;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate Expected_End_Date;
    private Status status;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateCreated;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dateUpdated;
}
