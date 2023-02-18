package dev.codextended.todo.mapper;

import dev.codextended.todo.dto.TodoDto;
import dev.codextended.todo.model.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TodoMapper {

    TodoMapper INSTANCE = Mappers.getMapper(TodoMapper.class);

    TodoDto fromEntity(Todo todo);

    Todo toEntity(TodoDto todoDto);
}
