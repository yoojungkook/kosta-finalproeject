package com.project.crewz.config.db.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Date;

@Getter
@AllArgsConstructor
public class Member {
    private String id;
    private String pwd;
    private String name;
    private Date birth;
    private String tel;
    private String photo;
    private String role;

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", tel='" + tel + '\'' +
                ", photo='" + photo + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
