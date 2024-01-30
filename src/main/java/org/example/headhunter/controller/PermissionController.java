package org.example.headhunter.controller;

import lombok.RequiredArgsConstructor;
import org.example.headhunter.dto.PermissionDTO;
import org.example.headhunter.service.PermissionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permission")
@RequiredArgsConstructor
public class PermissionController {
    private final PermissionService service;

    @GetMapping
    public List<PermissionDTO> getPermissions(){
        return service.getPermissions();
    }

    @GetMapping("/{id}")
    public PermissionDTO getPermission(@PathVariable Integer id){
        return service.getPermission(id);
    }

    @PostMapping
    public PermissionDTO addPermission(@RequestBody PermissionDTO permissionDTO){
        return service.addPermission(permissionDTO);
    }

    @PutMapping("/{id}")
    public PermissionDTO updatePermission(@PathVariable Integer id, @RequestBody PermissionDTO permissionDTO){
        return service.updatePermission(id, permissionDTO);
    }

    @DeleteMapping("/{id}")
    public void deletePermission(@PathVariable Integer id){
        service.deletePermission(id);
    }
}
