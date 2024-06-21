package umc.th.project.springProject.converter;

import umc.th.project.springProject.DTO.TempResponse;

public class TempConverter {

    public static TempResponse.TempTestDTO toTempTestDTO(){
        return TempResponse.TempTestDTO.builder()
                .testString("This is Test!")
                .build();
    }
}
