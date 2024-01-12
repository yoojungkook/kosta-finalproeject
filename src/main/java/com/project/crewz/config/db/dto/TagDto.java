package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagDto {
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
