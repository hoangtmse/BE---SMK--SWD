package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BadgeDTO {

    private Long id;
    private String badgeName;
    private String description;
    private List<MemberBadgeDTO> memberBadges;
    private LocalDate dateCreated;
    private LocalDate dateUpdated;
    private Status status;
}
