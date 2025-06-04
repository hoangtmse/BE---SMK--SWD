package com.swd.smk.model;

import com.swd.smk.enums.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Member_ID", nullable = false)
    private Member member;

    @Column(nullable = false)
    private String content;

    @Column(name = "Post_Date")
    private LocalDateTime postDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
}
