package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@Getter
@AllArgsConstructor
public class MoimSub {
    private Integer moimNo;
    private String memberId;
    private Date iDate;

    @Override
    public String toString() {
        return "MoimSub{" +
                "moimNo=" + moimNo +
                ", memberId='" + memberId + '\'' +
                ", iDate=" + iDate +
                '}';
    }
}
