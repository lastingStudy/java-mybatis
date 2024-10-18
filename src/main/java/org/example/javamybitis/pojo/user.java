package org.example.javamybitis.pojo;

public class user {
    private int id;
    private String username;
    private String password;
    private String petName;
    private int userSex;
    private int userAge;

    public user() {
    }

    public user(int id, String username, String password, String petName, int userSex, int userAge) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.petName = petName;
        this.userSex = userSex;
        this.userAge = userAge;
    }

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public user(String username, String password, String petName) {
        this.username = username;
        this.password = password;
        this.petName = petName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", petName='" + petName + '\'' +
                ", userSex=" + userSex +
                ", userAge=" + userAge +
                '}';
    }
}
