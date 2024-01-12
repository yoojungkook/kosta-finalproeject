package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocalDto {
    private Integer no;
    private Integer somoimNo;
    private Integer regionNo;
    private String city;
    private String roadNo;

    @Override
    public String toString() {
        return "Local{" +
                "no=" + no +
                ", somoimNo=" + somoimNo +
                ", regionNo=" + regionNo +
                ", city='" + city + '\'' +
                ", roadNo='" + roadNo + '\'' +
                '}';
    }
}
