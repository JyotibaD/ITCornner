package com.ITCornner.it_cornner.controller;

import java.util.List;
import java.util.Map;

import com.ITCornner.it_cornner.dto.ApiResponse;
import com.ITCornner.it_cornner.dto.UserDto;
import com.ITCornner.it_cornner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Autowired
    private UserService userService;

    //Post - create user
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto)
    {
        UserDto createdUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto , HttpStatus.CREATED);
    }

    //Put - update user

    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUser(@Valid @RequestBody  UserDto userDto, @PathVariable("userId") Integer uId)
    {
        UserDto updatedUser = this.userService.updateUser(userDto, uId);
        return  ResponseEntity.ok(updatedUser);
    }

//Delete- delete user

    @DeleteMapping("/{userId}")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid)
    {
        this.userService.deleteUser(uid);
        return new ResponseEntity<ApiResponse>(new ApiResponse("User deleted successfully",true), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity <List<UserDto>> getAllUser()
    {
        List<UserDto> getAlluser = this.userService.getAllUser();
        return  ResponseEntity.ok(getAlluser);
//
//	return ResponseEntity.ok(this.userService.getAllUser());
    }

//Get - Single user get

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getSingleUser(@PathVariable Integer userId)
    {
//	UserDto getUser = this.userService.getUserById(userId);
//	return new ResponseEntity<UserDto>(getUser, HttpStatus.ACCEPTED);

        return ResponseEntity.ok(this.userService.getUserById(userId));
    }











}