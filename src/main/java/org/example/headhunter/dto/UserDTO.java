package org.example.headhunter.dto;

import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
    private Integer id;
    private String username;
    private String password;
    private RoleDTO role;
}
