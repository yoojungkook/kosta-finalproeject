package com.project.crewz.config.db.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegionDto {
    private Integer no;
    private String name;
    private String ename;
    private MultipartFile mf;
    public Long acc;

    @Override
    public String toString() {
        return "RegionDto{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", ename='" + ename + '\'' +
                ", mf=" + mf +
                ", acc=" + acc +
                '}';
    }
}
