package org.example.headhunter.mapper;

import org.example.headhunter.dto.UserDTO;
import org.example.headhunter.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {
}
