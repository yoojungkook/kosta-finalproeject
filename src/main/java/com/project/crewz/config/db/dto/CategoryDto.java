package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Integer no;
    private String name;
    private String photo;
    private MultipartFile mf;
    private String acc;

    @Override
    public String toString() {
        return "CategoryDto{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", mf=" + mf +
                ", acc='" + acc + '\'' +
                '}';
    }
}
