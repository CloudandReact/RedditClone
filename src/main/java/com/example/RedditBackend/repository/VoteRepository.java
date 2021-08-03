package com.example.RedditBackend.repository;

import com.example.RedditBackend.model.Post;
import com.example.RedditBackend.model.User;
import com.example.RedditBackend.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
