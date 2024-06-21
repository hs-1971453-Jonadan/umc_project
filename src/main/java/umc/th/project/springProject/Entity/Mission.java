package umc.th.project.springProject.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long storeId;
    private String reward;
    private LocalDateTime deadline;
    private String missionSpec;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
