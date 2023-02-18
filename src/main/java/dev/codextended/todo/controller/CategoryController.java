package dev.codextended.todo.controller;

import dev.codextended.todo.dto.CategoryDto;
import dev.codextended.todo.dto.TodoDto;
import dev.codextended.todo.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.createCategory(categoryDto));
    }

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return ResponseEntity.ok(categoryService.getAllCategories());
    }

    @GetMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable("categoryId")Long categoryId) {
        return ResponseEntity.ok(categoryService.getCategoryById(categoryId));
    }

    @PutMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable("categoryId")Long categoryId, @RequestBody CategoryDto categoryDto){
        return ResponseEntity.ok(categoryService.updateCategory(categoryId, categoryDto));
    }

    @GetMapping(value = "/{categoryId}/todos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TodoDto>> getAllTodoByCategoriesId(@PathVariable Long categoryId) {
        return ResponseEntity.ok(categoryService.getAllTodoByCategoriesId(categoryId));
    }

    @GetMapping(value = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<CategoryDto>> getAllCategoriesByUserId(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(categoryService.getAllCategoriesByUserId(userId));
    }

    @DeleteMapping(value = "/{categoryId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CategoryDto> deleteCategory(@PathVariable("categoryId") Long categoryId) {
        return ResponseEntity.ok(categoryService.deleteCategory(categoryId));
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TodoDto>> getALlTodoByCategoriesForToday(@PathVariable("userId") Long userID) {
        return null;
    }
}
