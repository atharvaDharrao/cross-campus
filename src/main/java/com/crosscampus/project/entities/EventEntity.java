package com.crosscampus.project.entities;

import com.crosscampus.project.enums.EventStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String eventName ;

    private String sportType ;

    private LocalDate eventDate ;

    private LocalDate registrationDeadline;

    private int maxTeamSize;

    @Column(length = 1000)
    private String description;

    @Enumerated(EnumType.STRING)
    private EventStatus status; // UPCOMING, COMPLETED, CANCELLED

    @ManyToOne
    @JoinColumn(name = "host_college_id")
    private CollegeEntity hostCollege;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<TeamEntity> teams;
}
