package org.example.headhunter.controller;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.RoleDTO;
import org.example.headhunter.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService service;

    @GetMapping
    public List<RoleDTO> getRoles(){
        return service.getRoles();
    }

    @GetMapping("/{id}")
    public RoleDTO getRole(@PathVariable Integer id){
        return service.getRole(id);
    }

    @PostMapping
    public RoleDTO addRole(@RequestBody RoleDTO roleDTO){
        return service.addRole(roleDTO);
    }

    @PutMapping("/{id}")
    public RoleDTO updateRole(@PathVariable Integer id, @RequestBody RoleDTO roleDTO){
        return service.updateRole(id, roleDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){
        service.deleteRole(id);
    }
}
