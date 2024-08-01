package com.ITCornner.it_cornner.service;

import com.ITCornner.it_cornner.dto.PostDto;
import com.ITCornner.it_cornner.entities.Category;
import com.ITCornner.it_cornner.entities.Post;
import com.ITCornner.it_cornner.entities.User;
import com.ITCornner.it_cornner.exception.ResourceNotFoundException;
import com.ITCornner.it_cornner.repositories.CategoryRepo;
import com.ITCornner.it_cornner.repositories.PostRepo;
import com.ITCornner.it_cornner.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId) {

        User user = this.userRepo.findById(userId).
                orElseThrow(() -> new ResourceNotFoundException("User","user Id",userId));

        Category category = this.categoryRepo.findById(categoryId).
                orElseThrow(()-> new  ResourceNotFoundException("Category","category Id", categoryId));

        Post post = this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.jpg");
        post.setAddedDate(new Date());
        post.setUser(user);
        post.setCategory(category);
        Post createdPost = this.postRepo.save(post);

        return this.modelMapper.map(createdPost, PostDto.class);
    }

    @Override
    public Post updatePost(PostDto postDto, Integer postId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Post getPost(Integer postId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Post> getAllpost() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deletePost(Integer postId) {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Post> getPostsByUser(Integer userId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Post> getPostsByCategory(Integer categoryId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Post> searchPosts(String keyword) {
        // TODO Auto-generated method stub
        return null;
    }
}
