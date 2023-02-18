package dev.codextended.todo.mapper;

import dev.codextended.todo.dto.UserAccountDto;
import dev.codextended.todo.model.UserAccount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserAccountMapper {
    UserAccountMapper INSTANCE = Mappers.getMapper(UserAccountMapper.class);

    UserAccountDto fromEntity(UserAccount userAccount);

    UserAccount toEntity(UserAccountDto userAccountDto);
}
