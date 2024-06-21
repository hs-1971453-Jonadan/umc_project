package umc.th.project.springProject.Repository;

import umc.th.project.springProject.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
