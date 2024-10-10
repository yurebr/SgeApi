/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.List;

/**
 *
 * @author Senai
 */
public class Aluno {
    private int id_aluno;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String senha;
    private String imagem;
    private List<Tarefa> tarefa;

    public Aluno() {
    }

    public Aluno(int id_aluno, String nome, String sobrenome, String cpf, String senha, String imagem, List<Tarefa> tarefa) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.senha = senha;
        this.imagem = imagem;
        this.tarefa = tarefa;
    }

    public int getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public List<Tarefa> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefa> tarefa) {
        this.tarefa = tarefa;
    }
    
    
}
