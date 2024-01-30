package org.example.headhunter.service;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.PermissionDTO;
import org.example.headhunter.mapper.PermissionMapper;
import org.example.headhunter.repository.PermissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionService {
    private final PermissionRepository repository;
    private final PermissionMapper mapper;

    public List<PermissionDTO> getPermissions() {
        return mapper.toDTOs(
                repository.findAll()
        );
    }

    public PermissionDTO getPermission(Integer id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    public PermissionDTO addPermission(PermissionDTO permissionDTO) {
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(permissionDTO)
                )
        );
    }

    public PermissionDTO updatePermission(Integer id, PermissionDTO permissionDTO) {
        permissionDTO.setId(id);
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(permissionDTO)
                )
        );
    }

    public void deletePermission(Integer id) {
        repository.deleteById(id);
    }
}
