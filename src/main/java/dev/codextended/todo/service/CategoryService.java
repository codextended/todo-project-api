package dev.codextended.todo.service;

import dev.codextended.todo.dto.CategoryDto;
import dev.codextended.todo.dto.TodoDto;
import dev.codextended.todo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    @Transactional
    public CategoryDto createCategory(CategoryDto categoryDto) {
        return null;
    }

    @Transactional
    public List<CategoryDto> getAllCategories() {
        return null;
    }

    @Transactional
    public CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto) {
        return null;
    }

    @Transactional
    public CategoryDto getCategoryById(Long categoryId) {
        return null;
    }

    @Transactional
    public List<TodoDto> getAllTodoByCategoriesId(Long categoryId) {
        return null;
    }

    @Transactional
    public CategoryDto deleteCategory(Long categoryId) {
        return null;
    }

    @Transactional
    public List<CategoryDto> getAllCategoriesByUserId(Long userId) {
        return null;
    }
}
