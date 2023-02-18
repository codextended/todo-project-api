package dev.codextended.todo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_account_id")
    @JsonIgnore
    private UserAccount userAccount;

    @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
    private List<Todo> todoList;
}
