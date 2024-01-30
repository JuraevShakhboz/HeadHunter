package org.example.headhunter.controller;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.UserDTO;
import org.example.headhunter.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping
    public List<UserDTO> getUsers(){
        return service.getUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getUser(@PathVariable Integer id){
        return service.getUser(id);
    }

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return service.addUser(userDTO);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        return service.updateUser(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }
}
