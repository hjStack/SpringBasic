package SpringBasic.basic.member;

import SpringBasic.basic.Grade;

public class Member {
//    public static final String VIP = " ";  //entity

    private Grade grade;  //등급
    private Long id;
    private String name;

    public  Member(Grade grade, Long id, String name) {
        this.grade = grade;
        this.id = id;
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
