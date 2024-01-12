package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Category {
    private Integer no;
    private String name;
    private String photo;
    private String acc;

    @Override
    public String toString() {
        return "Category{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", acc='" + acc + '\'' +
                '}';
    }
}
