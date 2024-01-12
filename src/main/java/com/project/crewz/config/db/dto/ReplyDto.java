package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReplyDto {
    private Integer no;
    private Integer reviewNo;
    private String memberId;
    private String content;
    private Date mDate;

    @Override
    public String toString() {
        return "Reply{" +
                "no=" + no +
                ", reviewNo=" + reviewNo +
                ", memberId='" + memberId + '\'' +
                ", content='" + content + '\'' +
                ", mDate=" + mDate +
                '}';
    }
}
