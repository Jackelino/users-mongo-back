package com.appranch.appranch.controller;

import com.appranch.appranch.documents.Usuarios;
import com.appranch.appranch.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Usuarios")
public class UsuariosController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public  ResponseEntity<List<Usuarios>> getAll(){
        return ResponseEntity.ok(usuarioRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Usuarios usuario){
        Usuarios user = usuarioRepository.save(usuario);
        return new ResponseEntity<Usuarios>(user, HttpStatus.CREATED);
    }

}
