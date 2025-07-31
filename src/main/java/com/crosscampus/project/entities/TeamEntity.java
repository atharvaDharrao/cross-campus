package com.crosscampus.project.entities;

import com.crosscampus.project.enums.TeamStatus;
import jakarta.persistence.*;
import jdk.jfr.Event;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TeamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String teamName;

    @Enumerated(EnumType.STRING)
    private TeamStatus status; // PENDING, APPROVED, DISQUALIFIED

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private CollegeEntity college;

    @ManyToOne
    @JoinColumn(name = "captain_id")
    private StudentEntity captain;
}
