package org.example.headhunter.mapper;

import org.example.headhunter.dto.RoleDTO;
import org.example.headhunter.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDTO, Role> {
}
