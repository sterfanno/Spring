package com.ssrc.labv1.service;

import com.ssrc.labv1.domain.User;
import com.ssrc.labv1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {


    public List<User> pesquisarPorEmailOuNome (String nome){
        return  userRepository.findByEmailNameOrEmail (nome);
    }

    @Autowired
    private UserRepository userRepository;

    public User salvar(User user) {
        return userRepository.save(user);
    }

    public User atualizar(User user) {
        return userRepository.save(user);
    }

    public void deletarPorId(Long id) throws Exception {
        userRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));

        userRepository.deleteById(id);
    }

    public User buscarPorId(Long id) throws Exception {
        return userRepository.findById(id)
                .orElseThrow(() -> new Exception("Nenhum registro encontrado com o ID"));
    }

    public List<User> listar() {
        return userRepository.findAll();
    }
}
