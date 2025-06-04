package com.swd.smk.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.swd.smk.enums.Status;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberShipPackageDTO {

    private Long id;
    private String package_Name;
    private Double price;
    private String description;
    private List<MemberDTO> Members;
    private Status status;
}
