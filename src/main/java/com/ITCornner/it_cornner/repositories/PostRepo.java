package com.ITCornner.it_cornner.repositories;

import java.util.List;

import com.ITCornner.it_cornner.entities.Category;
import com.ITCornner.it_cornner.entities.Post;
import com.ITCornner.it_cornner.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepo extends JpaRepository<Post, Integer>
{
    List<Post> findByUser(User user);
    List<Category> findByCategory(Category category);
}