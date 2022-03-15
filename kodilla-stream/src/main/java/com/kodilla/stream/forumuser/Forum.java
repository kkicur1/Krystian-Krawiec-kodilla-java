package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser>userList= new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1,"Krystian",'M', LocalDate.of(1989,12,15),2));
        userList.add(new ForumUser(2,"Magda",'F', LocalDate.of(1984,8,10),100));
        userList.add(new ForumUser(3,"Lukasz",'M', LocalDate.of(1969,10,15),1010));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
