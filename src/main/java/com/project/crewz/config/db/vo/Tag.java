package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@Getter
@AllArgsConstructor
public class Tag {
    private Integer no;
    private String name;

    @Override
    public String toString() {
        return "Tag{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
