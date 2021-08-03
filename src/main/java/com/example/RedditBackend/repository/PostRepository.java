package com.example.RedditBackend.repository;


import com.example.RedditBackend.model.Post;
import com.example.RedditBackend.model.Subreddit;
import com.example.RedditBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
