package umc.th.project.springProject.DTO;

import lombok.Builder;
import lombok.Getter;

public class PostRequestDto {

    @Getter
    @Builder
    public static class addPostRequestDto{
        private String title;
        private String content;
    }
}
