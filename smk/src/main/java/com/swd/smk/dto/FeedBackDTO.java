package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FeedBackDTO {

    private Long id;
    private MemberDTO member;
    private String content;
    private Integer rating;
    private LocalDate feedbackDate;
    private Status status;
}
