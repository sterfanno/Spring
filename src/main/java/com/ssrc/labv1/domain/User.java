package com.ssrc.labv1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long usuarioId;

    @NotEmpty(message = "Obrigatório informar o nome do usuário")
    private String nome;

    @NotEmpty(message = "Obrigatório informar o e-email do usuário")
    private String email;

    @NotEmpty(message = "Obrigatório informar o sexo do usuário")
    private String sexo;

    @NotEmpty(message = "Obrigatório informar a data de nascimento do usuário")
    private Date nascimento;


    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
