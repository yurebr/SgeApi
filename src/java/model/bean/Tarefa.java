/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Tarefa {
    private int id_tarefa;
    private String nome_tarefa;
    private String descricao;
    private float nota;
    private String nome_turma;
    private Disciplina disciplina;

    public Tarefa() {
    }

    public Tarefa(int id_tarefa, String nome_tarefa, String descricao, float nota, String nome_turma, Disciplina disciplina) {
        this.id_tarefa = id_tarefa;
        this.nome_tarefa = nome_tarefa;
        this.descricao = descricao;
        this.nota = nota;
        this.nome_turma = nome_turma;
        this.disciplina = disciplina;
    }

    public int getId_tarefa() {
        return id_tarefa;
    }

    public void setId_tarefa(int id_tarefa) {
        this.id_tarefa = id_tarefa;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    
}
