package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmokingLogDTO {

    private Long id;
    private MemberDTO member;
    private Integer cigarettesPerDay;
    private String frequency;
    private Double cost;
    private LocalDate logDate;
    private Status status;
}
