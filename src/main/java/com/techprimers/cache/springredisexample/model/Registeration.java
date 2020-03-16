package com.techprimers.cache.springredisexample.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "mytable")
public class Registeration {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int profileId;

    @Column(name = "Username")
    private String username;

    public int getProfileId() {
        return profileId;
    }

    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Registeration{" +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", password='" + password + '\'' +
                ", emailId='" + emailId + '\'' +
                ", mobile=" + mobile +
                ", totalWorkExp=" + totalWorkExp +
                '}';
    }

    public Registeration(String username, String firstName, String lasttName, String password, String emailId, String mobile, int totalWorkExp, int id, int age) {
        this.username = username;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.password = password;
        this.emailId = emailId;
        this.mobile = mobile;
        this.totalWorkExp = totalWorkExp;
        this.id = id;
        this.age = age;
    }
    public Registeration(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getTotalWorkExp() {
        return totalWorkExp;
    }

    public void setTotalWorkExp(int totalWorkExp) {
        this.totalWorkExp = totalWorkExp;
    }

    @Column(name = "Firstname")
    private String firstName;

    @Column(name = "Lastname")
    private String lasttName;

    @Column(name = "Password")
    private String password;

    @Column(name = "Emailid")
    private String emailId;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "Totalworkexp")
    private int totalWorkExp;

    @Column(name = "id")
    private int id;

    @Column(name = "age")
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
