package com.ITCornner.it_cornner.service;

import com.ITCornner.it_cornner.dto.CategoryDto;

import java.util.List;



public interface CategoryService
{
    //create
    CategoryDto createCategory(CategoryDto categoryDto);
    //update
    CategoryDto updateCategory(CategoryDto categoryDto , Integer categoryId);
    //delete
    void deleteCategory(Integer categoryId);
    //getSingle Category
    CategoryDto getCategory( Integer categoryId);
    //getAllCategory

    List<CategoryDto> getAllCategory( );
}
