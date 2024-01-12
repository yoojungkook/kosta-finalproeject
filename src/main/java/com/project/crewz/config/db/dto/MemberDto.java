package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String id;
    private String pwd;
    private String name;
    private Date birth;
    private String tel;
    private String photo;
    private MultipartFile mf;
    private String role;

    @Override
    public String toString() {
        return "MemberDto{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", tel='" + tel + '\'' +
                ", photo='" + photo + '\'' +
                ", mf=" + mf +
                ", role='" + role + '\'' +
                '}';
    }
}
