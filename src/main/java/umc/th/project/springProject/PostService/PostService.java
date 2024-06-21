package umc.th.project.springProject.PostService;

import org.springframework.transaction.annotation.Transactional;
import umc.th.project.springProject.DTO.PostRequestDto;
import umc.th.project.springProject.Entity.Post;
import umc.th.project.springProject.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public Post addPost(PostRequestDto.addPostRequestDto requestDto) {
        String title = requestDto.getTitle();
        String content = requestDto.getContent();

        Post newPost = Post.builder()
                .title(title)
                .content(content)
                .build();

        return postRepository.save(newPost);
    }

    public Post searchPost(Long postId) {
        Optional<Post> post = postRepository.findById(postId);

        return post.get();
    }

    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }

    @Transactional
    public Post updatePost(Long postId, PostRequestDto.addPostRequestDto requestDto) {
        Post post = postRepository.findById(postId).get();

        String title = requestDto.getTitle();
        String content = requestDto.getContent();

        post.updateTitle(title);
        post.updateContent(content);

        System.out.println("post.getTitle() = " + post.getTitle());
        System.out.println("post.getContent() = " + post.getContent());
        return post;
    }
}

