package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;
import java.util.Arrays;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MoimDto {
    private Integer no;
    private Integer categoryNo;
    private String memberId;
    private String info;
    private String title;
    private String content;
    private String photo1;
    private String photo2;
    private String photo3;
    private MultipartFile[] mf;
    private Date mDate;

    @Override
    public String toString() {
        return "MoimDto{" +
                "no=" + no +
                ", categoryNo=" + categoryNo +
                ", memberId='" + memberId + '\'' +
                ", info='" + info + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", photo1='" + photo1 + '\'' +
                ", photo2='" + photo2 + '\'' +
                ", photo3='" + photo3 + '\'' +
                ", mf=" + Arrays.toString(mf) +
                ", mDate=" + mDate +
                '}';
    }
}
