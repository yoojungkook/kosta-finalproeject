package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagHistoryDto {
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
