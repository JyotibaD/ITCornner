package com.ITCornner.it_cornner.repositories;

import com.ITCornner.it_cornner.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;




public interface CategoryRepo extends JpaRepository<Category,Integer>
{

}
