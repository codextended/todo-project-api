package dev.codextended.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startDate;
    private boolean done;
    private boolean favorite;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnore
    private Category category;
}
