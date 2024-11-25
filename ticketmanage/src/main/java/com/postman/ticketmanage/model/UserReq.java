package com.postman.ticketmanage.model;

public class UserReq {
    private  String name;
    private int age;
    private String mobNo;
    private  String mail;
    private String pwd;
    private String reTypePwd;

    public UserReq() {
    }

    public UserReq(String name, String reTypePwd, int age, String mobNo, String mail, String pwd) {
        this.name = name;
        this.reTypePwd = reTypePwd;
        this.age = age;
        this.mobNo = mobNo;
        this.mail = mail;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getReTypePwd() {
        return reTypePwd;
    }

    public void setReTypePwd(String reTypePwd) {
        this.reTypePwd = reTypePwd;
    }

    @Override
    public String toString() {
        return "UserReq{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobNo='" + mobNo + '\'' +
                ", mail='" + mail + '\'' +
                ", pwd='" + pwd + '\'' +
                ", reTypePwd='" + reTypePwd + '\'' +
                '}';
    }
}
