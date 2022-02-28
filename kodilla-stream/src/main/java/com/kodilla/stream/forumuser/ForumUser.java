package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int idNumber;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int idNumber, String userName, char userSex, LocalDate birthDate, int postNumber) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
