package com.mysoft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DAO {
    static List<Post> posts;

    static {
        posts = new ArrayList<>();
        posts.add(new Post(1, "hello"));
        posts.add(new Post(2, "world"));
        posts.add(new Post(3, "people"));
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        for (Iterator<Post> iter = posts.iterator(); iter.hasNext(); ) {
            if (iter.next().getId() == id) {
                iter.remove();
                break;
            }
        }

        //posts.removeIf(post -> post.getId() == id);
    }

    public static void addPost(String txt) {
        posts.add(new Post(posts.size() + 1, txt));
    }
}
