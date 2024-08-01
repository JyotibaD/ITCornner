package com.ITCornner.it_cornner.service;

import com.ITCornner.it_cornner.dto.PostDto;
import com.ITCornner.it_cornner.entities.Post;

import java.util.List;

public interface PostService {
    //create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //update
    Post updatePost(PostDto postDto , Integer postId);

    //getPost

    Post getPost(Integer postId);

    //getAllPost

    List<Post> getAllpost();

    //deletePost
    void deletePost(Integer postId);

    //get all posts by user

    List<Post> getPostsByUser(Integer userId);

    //get all posts by category

    List<Post> getPostsByCategory(Integer categoryId);

    //search posts
    List<Post> searchPosts(String keyword);
}
