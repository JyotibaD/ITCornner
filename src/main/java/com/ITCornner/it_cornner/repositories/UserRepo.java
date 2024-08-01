package com.ITCornner.it_cornner.repositories;

import com.ITCornner.it_cornner.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo  extends JpaRepository<User, Integer>{

}
