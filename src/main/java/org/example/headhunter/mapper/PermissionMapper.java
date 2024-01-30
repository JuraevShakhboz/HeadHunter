package org.example.headhunter.mapper;

import org.example.headhunter.dto.PermissionDTO;
import org.example.headhunter.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {
}
