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
public class MoimSubDto {
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
