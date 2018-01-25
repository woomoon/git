package com.woomoon.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tb_stu")
public class StuEntity {

    @Id
    private Integer stu_id;
    private String stu_name;
    private String stu_sex;

    public Integer getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_sex() {
        return stu_sex;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setStu_sex(String stu_sex) {
        this.stu_sex = stu_sex;
    }

    public StuEntity() {
    }

    public StuEntity(Integer stu_id, String stu_name, String stu_sex) {
        this.stu_id = stu_id;
        this.stu_name = stu_name;
        this.stu_sex = stu_sex;
    }

    public String toString() {
        return "StuEntity [stu_id=" + stu_id + ", stu_name=" + stu_name + ", stu_sex=" + stu_sex + "]";
    }


}