package org.example.headhunter.service;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.RoleDTO;
import org.example.headhunter.mapper.RoleMapper;
import org.example.headhunter.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository repository;
    private final RoleMapper mapper;

    public List<RoleDTO> getRoles() {
        return mapper.toDTOs(
                repository.findAll()
        );
    }

    public RoleDTO getRole(Integer id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    public RoleDTO addRole(RoleDTO roleDTO) {
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(roleDTO)
                )
        );
    }

    public RoleDTO updateRole(Integer id, RoleDTO roleDTO) {
        roleDTO.setId(id);
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(roleDTO)
                )
        );
    }

    public void deleteRole(Integer id) {
        repository.deleteById(id);
    }
}
