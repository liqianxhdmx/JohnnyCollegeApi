package com.cherry.college.vo;

public class User{
    private int userId;
    private String userName;
    private String userSex;
    private String college;

    public int getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getUserSex(){
        return this.userSex;
    }

    public String getCollege(){
        return this.college;
    }

    public void setUserId(int value){
        this.userId = value;
    }

    public void setUserName(String value){
        this.userName = value;
    }

    public void setUserSex(String value){
        this.userSex = value;
    }

    public void setCollege(String value){
        this.college = value;
    }
}
