package dev.codextended.todo.controller;

import dev.codextended.todo.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class UserAccountController {

    private final UserAccountService userAccountService;
}
