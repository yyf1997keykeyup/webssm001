package com.yyf.system.pojo;

/**
 * Created by Feng on 2017/6/3.
 */
public class User {

    private Integer id;
    private String userName;
    private String userPassword;
    private Integer userType;//用户类型（0-管理员；1-学校；2-老师；3-学生）
    private String stuName;
    private String stuClass;
    private String stuSchool;
    private String statusQues;
    private String statusMBTI;
    private String statusVAT;
    private String statusHolland;

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuSchool() {
        return stuSchool;
    }

    public void setStuSchool(String stuSchool) {
        this.stuSchool = stuSchool;
    }

    public String getStatusMBTI() {
        return statusMBTI;
    }

    public void setStatusMBTI(String statusMBTI) {
        this.statusMBTI = statusMBTI;
    }

    public String getStatusVAT() {
        return statusVAT;
    }

    public void setStatusVAT(String statusVAT) {
        this.statusVAT = statusVAT;
    }

    public String getStatusHolland() {
        return statusHolland;
    }

    public void setStatusHolland(String statusHolland) {
        this.statusHolland = statusHolland;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getStatusQues() {
        return statusQues;
    }

    public void setStatusQues(String statusQues) {
        this.statusQues = statusQues;
    }

    public boolean isAdministrator(){
        return this.userType==0;
    }

    public boolean isSchool(){
        return this.userType==1;
    }

    public boolean isTeacher(){
        return this.userType==2;
    }

    public boolean isStudent(){
        return this.userType==3;
    }

}
