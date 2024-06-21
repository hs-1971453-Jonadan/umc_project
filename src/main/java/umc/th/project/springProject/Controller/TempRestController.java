package umc.th.project.springProject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.th.project.springProject.DTO.TempResponse;
import umc.th.project.springProject.apiPayload.ApiResponse;
import umc.th.project.springProject.converter.TempConverter;

@RestController
@RequestMapping("/temp")
@RequiredArgsConstructor
public class TempRestController {

    @GetMapping("/test")
    public ApiResponse<TempResponse.TempTestDTO> testAPI(){

        return ApiResponse.onSuccess(TempConverter.toTempTestDTO());
    }
}
