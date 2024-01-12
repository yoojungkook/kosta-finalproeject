package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class TagHistory {
    private Integer somoimNo;
    private Integer tagNo;
    private Date mDate;

    @Override
    public String toString() {
        return "TagHistory{" +
                "somoimNo=" + somoimNo +
                ", tagNo=" + tagNo +
                ", mDate=" + mDate +
                '}';
    }
}
