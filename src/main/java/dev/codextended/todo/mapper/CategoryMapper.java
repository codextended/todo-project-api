package dev.codextended.todo.mapper;

import dev.codextended.todo.dto.CategoryDto;
import dev.codextended.todo.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDto fromEntity(Category category);

    Category toEntity(CategoryDto categoryDto);
}
