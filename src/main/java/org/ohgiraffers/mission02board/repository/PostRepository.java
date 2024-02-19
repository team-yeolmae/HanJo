package org.ohgiraffers.mission02board.repository;

import org.ohgiraffers.mission02board.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
