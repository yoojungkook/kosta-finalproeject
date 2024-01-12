package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Region {
    private Integer no;
    private String name;
    private String ename;
    private Long acc;

    @Override
    public String toString() {
        return "Local{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", ename='" + ename + '\'' +
                ", acc=" + acc +
                '}';
    }
}
