package com.crosscampus.project.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class CollegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String name ;

    private String location ;

    private String email ;

    private String logout ;

    @OneToMany(mappedBy = "college", cascade = CascadeType.ALL)
    private List<StudentEntity> students;

    @OneToMany(mappedBy = "hostCollege", cascade = CascadeType.ALL)
    private List<EventEntity> events ;
}
