package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@Getter
@AllArgsConstructor
public class Reply {
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
