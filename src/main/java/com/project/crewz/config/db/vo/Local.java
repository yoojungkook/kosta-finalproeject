package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Local {
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
