package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProgressDTO {

    private Long progressId;
    private MemberDTO member;
    private Integer daysSmokeFree;
    private Double moneySaved;
    private String healthImprovement;
    private LocalDate updateDate;
    private Status status;
}
