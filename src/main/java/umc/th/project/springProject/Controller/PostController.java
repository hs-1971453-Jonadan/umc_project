package umc.th.project.springProject.Controller;

import org.springframework.web.bind.annotation.*;
import umc.th.project.springProject.DTO.PostRequestDto;
import umc.th.project.springProject.DTO.PostResponseDto;
import umc.th.project.springProject.Entity.Post;
import lombok.RequiredArgsConstructor;
import umc.th.project.springProject.PostService.PostService;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("post")
    public PostResponseDto.addPostResponseDto addPost(@RequestBody PostRequestDto.addPostRequestDto requestDto) {

        Post post = postService.addPost(requestDto);

        return PostResponseDto.addPostResponseDto.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }


    @GetMapping("post/{post-id}")
    public PostResponseDto.searchPostResponseDto searchPost(
            @PathVariable(name = "post-id") Long postId){

        Post post = postService.searchPost(postId);

        return PostResponseDto.searchPostResponseDto.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .build();
    }

    @DeleteMapping("post/{post-id}")
    public PostResponseDto.deletePostResponseDto deletePost(@PathVariable(name = "post-id") Long postId){
        postService.deletePost(postId);

        return PostResponseDto.deletePostResponseDto.builder()
                .postId(postId)
                .message("삭제 성공")
                .build();
    }

    @PatchMapping("post/{post-id}")
    public PostResponseDto.updatePostResponseDto updatePost(@PathVariable(name = "post-id")Long postId,
                                                            @RequestBody PostRequestDto.addPostRequestDto requestDto){

        Post post = postService.updatePost(postId, requestDto);

        return PostResponseDto.updatePostResponseDto.builder()
                .postId(post.getId())
                .title(post.getTitle())
                .content(post.getContent())
                .updatedAt(LocalDateTime.now())
                .build();
    }
}
