package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberBadgeDTO {

    private Long id;
    private MemberDTO member;
    private BadgeDTO badge;
    private String badgeName;
    private String description;
    private String dateEarned;

}
