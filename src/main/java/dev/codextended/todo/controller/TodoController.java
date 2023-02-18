package dev.codextended.todo.controller;

import dev.codextended.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;
}
