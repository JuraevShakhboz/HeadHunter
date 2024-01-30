package org.example.headhunter.dto;

import lombok.*;
import org.example.headhunter.entity.Permission;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RoleDTO {
    private Integer id;
    private String name;
    private Set<PermissionDTO> permissions;
}
