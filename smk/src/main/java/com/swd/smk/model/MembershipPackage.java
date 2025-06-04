package com.swd.smk.model;

import com.swd.smk.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "membership_package")
@Data
public class MembershipPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String package_Name;

    @Column(nullable = false)
    private Double price;

    private String description;

    @OneToMany(mappedBy = "membership_Package")
    private List<Member> Members;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
