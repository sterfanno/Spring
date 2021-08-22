package com.ssrc.labv1.resource;


import com.ssrc.labv1.domain.User;
import com.ssrc.labv1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UserResources {

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<User> showAll(){return userRepository.findAll();}

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> buscarPorId(@PathVariable("id") Long idUser){
        return userRepository.findById(idUser).map(ator ->
                ResponseEntity.ok(ator)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Object> gravar(@RequestBody User user){
        userRepository.save(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getUsuarioId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping
    public  void atualizar(@RequestBody User user){
        userRepository.save(user);
    }

    @DeleteMapping
    public  void deletar(@RequestBody User user){
        userRepository.delete(user);
    }


}
