package umc.th.project.springProject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String gender;
    private String address;
    private String state;
    private String specs;
    private LocalDate inactiveDate;
    private String socialType;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private String email;
    private int point;
}
