package com.crosscampus.project.entities;

import com.crosscampus.project.enums.Role;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class StudentEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name ;

    @Column(unique = true)
    private String email ;

    private String passwordHash ;

    @Enumerated(EnumType.STRING)
    private Role role ;
}
