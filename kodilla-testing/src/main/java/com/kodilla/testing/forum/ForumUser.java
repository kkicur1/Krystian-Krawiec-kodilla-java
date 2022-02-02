package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {

    private String name;                                        // [6]
    private String realName;                                    // [7]
    private List<ForumPost> posts = new ArrayList<>();          // [8]
    private List<ForumComment> comments = new LinkedList<>();   // [9]

    public ForumUser(String name, String realName) {            // [10]
        //name visible on forum
        this.name = name;                                        // [11]
        //real name of the user
        this.realName = realName;                                // [12]
    }                                                           // [13]

    public void addPost(String author, String postBody) {       // [14]
        // do nothing
    }                                                           // [15]

    public void addComment(ForumPost thePost, String author, String commentBody) {   // [16]
        // do nothing
    }                                                           // [17]

    public int getPostsQuantity() {                             // [18]
        // return 100 temporarily
        return 100;                                              // [19]
    }                                                           // [20]

    public int getCommentsQuantity() {                          // [21]
        // return 100 temporarily
        return 100;                                              // [22]
    }                                                           // [23]

    public ForumPost getPost(int postNumber) {                  // [24]
        // returning null means that the operation was unsuccessful
        return null;                                             // [25]
    }                                                           // [26]

    public ForumComment getComment(int commentNumber) {         // [27]
        // returning null means that the operation was unsuccessful
        return null;                                             // [28]
    }                                                           // [29]

    public boolean removePost(ForumPost thePost) {              // [30]
        // return true temporarily
        return true;                                             // [31]
    }                                                           // [32]

    public boolean removeComment(ForumComment theComment) {     // [33]
        // return true temporarily
        return true;                                             // [34]
    }                                                           // [35]

    public String getName() {                                   // [36]
        return name;                                             // [37]
    }                                                           // [38]

    public String getRealName() {                               // [39]
        return realName;                                         // [40]
    }
}
