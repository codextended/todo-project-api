package dev.codextended.todo.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserAccountDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    @JsonIgnore
    private List<CategoryDto> category;
}
