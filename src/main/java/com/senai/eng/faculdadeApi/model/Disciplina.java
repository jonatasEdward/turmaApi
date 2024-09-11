package com.senai.eng.faculdadeApi.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String descricao;

    @ManyToOne
    @JoinColumn
    private Professor professor;

    @ManyToOne
    @JoinColumn
    private Turma turma;

    @ManyToMany(mappedBy = "disciplinas")
    private Set<Aluno> alunos;

    public Disciplina() {
    }

    public Disciplina(Integer id, String nome, String descricao, Professor professor, Turma turma, Set<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.professor = professor;
        this.turma = turma;
        this.alunos = alunos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Set<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(Set<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", professor=" + professor +
                ", turma=" + turma +
                ", alunos=" + alunos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(descricao, that.descricao) && Objects.equals(professor, that.professor) && Objects.equals(turma, that.turma) && Objects.equals(alunos, that.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, descricao, professor, turma, alunos);
    }
}
