package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main (String[] args) {
        Forum forum=new Forum();
        Map<String,ForumUser> listOfUser=forum.getUserList(). stream()
                .filter(forumUser -> forumUser.getUserSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate()> LocalDate.of(2002,02,28))
                .filter(forumUser -> forumUser.getPostNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        listOfUser.entrySet().stream()
                .map(entry->entry.getKey()+":"+entry.getValue())
                .forEach(System.out::println);
    }
}
