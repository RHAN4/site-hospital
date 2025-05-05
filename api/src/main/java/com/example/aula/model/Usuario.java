package com.example.aula.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    private String nome;

    @Column(nullable = false)
    @NotBlank(message = "Telefone é obrigatório.")
    @Size(min = 8, message = "Telefone inválido.")
    private String telefone;

    @Column(nullable = false)
    @NotBlank(message = "CPF é obrigatório.")
    @Size(min = 11, message = "CPF inválido.")
    private String cpf;

    @Column(nullable = false)
    @NotBlank(message = "CEP é obrigatório.")
    @Size(min = 8, message = "CEP inválido.")
    private String cep;

    @Column(nullable = false)
    @NotBlank(message = "E-mail é obrigatório.")
    @Email(message = "Deve ser um e-mail válido.")
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "Senha é obrigatória.")
    @Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres.")
    private String senha;

    public Usuario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Nome é obrigatório.") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório.") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Telefone é obrigatório.") @Size(min = 8, message = "Telefone inválido.") String getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotBlank(message = "Telefone é obrigatório.") @Size(min = 8, message = "Telefone inválido.") String telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "CPF é obrigatório.") @Size(min = 11, message = "CPF inválido.") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "CPF é obrigatório.") @Size(min = 11, message = "CPF inválido.") String cpf) {
        this.cpf = cpf;
    }

    public @NotBlank(message = "CEP é obrigatório.") @Size(min = 8, message = "CEP inválido.") String getCep() {
        return cep;
    }

    public void setCep(@NotBlank(message = "CEP é obrigatório.") @Size(min = 8, message = "CEP inválido.") String cep) {
        this.cep = cep;
    }

    public @NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "E-mail é obrigatório.") @Email(message = "Deve ser um e-mail válido.") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Senha é obrigatória.") @Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres.") String getSenha() {
        return senha;
    }

    public void setSenha(@NotBlank(message = "Senha é obrigatória.") @Size(min = 4, message = "A senha deve ter no mínimo 4 caracteres.") String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuário: " +
                "ID: " + id +
                ", nome: '" + nome + '\'' +
                ", telefone: '" + telefone + '\'' +
                ", CPF: '" + cpf + '\'' +
                ", CEP: '" + cep + '\'' +
                ", email: '" + email + '\'' +
                ", senha: '" + senha + '\'';
    }
}

