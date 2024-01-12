package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private Integer no;
    private String memberId;
    private Long somoimNo;
    private String title;
    private String content;
    private String photo1;
    private String photo2;
    private String photo3;
    private MultipartFile[] mf;
    private String mDate;

    @Override
    public String toString() {
        return "ReviewDto{" +
                "no=" + no +
                ", memberId='" + memberId + '\'' +
                ", somoimNo=" + somoimNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", photo1='" + photo1 + '\'' +
                ", photo2='" + photo2 + '\'' +
                ", photo3='" + photo3 + '\'' +
                ", mf=" + Arrays.toString(mf) +
                ", mDate='" + mDate + '\'' +
                '}';
    }
}
