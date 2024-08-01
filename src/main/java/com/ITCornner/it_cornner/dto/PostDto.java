package com.ITCornner.it_cornner.dto;

import java.util.Date;


import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostDto
{
    private String title;

    @Column(length=500)
    private String content;
    private String imageName;
    private Date addedDate;

    // while returning post we get category, user
    private CategoryDto category;
    private UserDto user;

}
