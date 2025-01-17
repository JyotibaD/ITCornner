package com.ITCornner.it_cornner.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto
{
    private int id;
    @NotEmpty
    @Size(min=4, message= "Username must be min of 4 character")
    private String name;
    @Email(message="Email address is not valid!")
    private String email;
    @NotEmpty
    @Size(min=3, max=10,message="Password must be min of 3 chars and max be 4 chars")
    private String password;
    @NotEmpty
    private String about;

}
