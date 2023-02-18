package dev.codextended.todo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoDto {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private boolean done;
    private boolean favorite;

    private CategoryDto category;
}
