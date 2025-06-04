package com.swd.smk.model;

import com.swd.smk.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "badge")
@Data
public class Badge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Member_ID", nullable = false)
    private Member member;

    @Column(name = "Badge_Name", nullable = false, length = 100)
    private String badgeName;

    @Column(name = "Earned_Date")
    private LocalDate earnedDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
