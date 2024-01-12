package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Review {
    private Integer no;
    private String memberId;
    private Long moimNo;
    private String title;
    private String content;
    private String photo1;
    private String photo2;
    private String photo3;
    private String mDate;

    @Override
    public String toString() {
        return "Review{" +
                "no=" + no +
                ", memberId='" + memberId + '\'' +
                ", moimNo=" + moimNo +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", photo1='" + photo1 + '\'' +
                ", photo2='" + photo2 + '\'' +
                ", photo3='" + photo3 + '\'' +
                ", mDate='" + mDate + '\'' +
                '}';
    }
}
