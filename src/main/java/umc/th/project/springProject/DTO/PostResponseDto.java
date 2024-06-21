package umc.th.project.springProject.DTO;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class PostResponseDto {

    @Getter
    @Builder
    public static class addPostResponseDto{
        private Long postId;
        private String title;
        private String content;
        private LocalDateTime createdAt;
    }

    @Getter
    @Builder
    public static class searchPostResponseDto{
        private Long postId;
        private String title;
        private String content;
    }

    @Getter
    @Builder
    public static class deletePostResponseDto{
        private Long postId;
        private String message;
    }

    @Getter
    @Builder
    public static class updatePostResponseDto{
        private Long postId;
        private String title;
        private String content;
        private LocalDateTime updatedAt;
    }
}
