package com.aspire.java.entity;

/**
 * @author wangxiantuan
 * @creationDate 2019/2/28 - 16:03
 */
public class User {
    private String name;//姓名
    private String email;//邮箱
    private String birth;//出生年月
    private String address;//地址

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birth='" + birth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
