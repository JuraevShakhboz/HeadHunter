package org.example.headhunter.service;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.UserDTO;
import org.example.headhunter.mapper.UserMapper;
import org.example.headhunter.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    public List<UserDTO> getUsers() {
        return mapper.toDTOs(
                repository.findAll()
        );
    }

    public UserDTO getUser(Integer id) {
        return mapper.toDTO(
                repository.getReferenceById(id)
        );
    }

    public UserDTO addUser(UserDTO userDTO) {
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(userDTO)
                )
        );
    }

    public UserDTO updateUser(Integer id, UserDTO userDTO) {
        userDTO.setId(id);
        return mapper.toDTO(
                repository.save(
                        mapper.toEntity(userDTO)
                )
        );
    }

    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
