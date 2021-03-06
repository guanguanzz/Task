/*对应的mysql建表语句：
create table if not exists`students`(
`name` varchar(10) not null,
`QQ` varchar(15) not null,
`type` varchar(10) not null,
`admission_time` varchar(20) not null,
`school` varchar(10) not null,
`num` varchar(10) not null,
`daily` varchar(100) not null,
`declaration` varchar(50) not null,
`elder` varchar(30) not null,
`knew_from` varchar(10) not null,
`ID` bigint auto_increment,
`create_at` bigint not null,
`update_at` bigint,
primary key(`id`),
index (`name`),
unique `online`(`num`)
)engine = innodb default charset = utf8;*/

package com.ptteng.pojo.model;


import com.ptteng.utils.annotation.StringVerify;

import java.io.Serializable;

public class Student implements Serializable {

    public Student() {

    }

    public Student(String name, String qq, String type, String admissionTime, String school,
                   String num, String daily, String declaration, String elder, String knewFrom) {
        this.name = name;
        this.qq = qq;
        this.type = type;
        this.admissionTime = admissionTime;
        this.school = school;
        this.num = num;
        this.daily = daily;
        this.declaration = declaration;
        this.elder = elder;
        this.knewFrom = knewFrom;
    }

    @StringVerify(maxLength = 8,aliasName = "姓名",isNotIllegal = true)
    private String name;
    @StringVerify(maxLength = 11,minLength = 5,aliasName = "QQ",isNumber = true)
    private String qq;
    @StringVerify(maxLength = 8,aliasName = "修真类型")
    private String type;
    @StringVerify(maxLength = 18,aliasName = "入学时间")
    private String admissionTime;
    @StringVerify(maxLength = 8,aliasName = "毕业院校")
    private String school;
    @StringVerify(maxLength = 8,aliasName = "线上学号")
    private String num;
    @StringVerify(maxLength = 50,aliasName = "日报链接")
    private String daily;
    @StringVerify(maxLength = 40,aliasName = "宣言")
    private String declaration;
    @StringVerify(maxLength = 20,aliasName = "辅导师兄")
    private String elder;
    @StringVerify(maxLength = 8,aliasName = "何处得知")
    private String knewFrom;
    private Long createAt;
    private Long updateAt;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDaily() {
        return daily;
    }

    public void setDaily(String daily) {
        this.daily = daily;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getElder() {
        return elder;
    }

    public String getKnewFrom() {
        return knewFrom;
    }

    public void setKnewFrom(String knewFrom) {
        this.knewFrom = knewFrom;
    }

    public void setElder(String elder) {
        this.elder = elder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                ", type='" + type + '\'' +
                ", admissionTime='" + admissionTime + '\'' +
                ", school='" + school + '\'' +
                ", num='" + num + '\'' +
                ", daily='" + daily + '\'' +
                ", declaration='" + declaration + '\'' +
                ", elder='" + elder + '\'' +
                ", knewFrom='" + knewFrom + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", id=" + id +
                '}';
    }
}

