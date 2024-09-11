package com.senai.eng.faculdadeApi.model;


import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String turma;

    private String descricao;

    @OneToMany
    @JoinColumn
    private Set<Disciplina> disciplinas;

    public Turma() {
    }

    public Turma(Integer id, String turma, String descricao, Set<Disciplina> disciplinas) {
        this.id = id;
        this.turma = turma;
        this.descricao = descricao;
        this.disciplinas = disciplinas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "id=" + id +
                ", turma='" + turma + '\'' +
                ", descricao='" + descricao + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma1 = (Turma) o;
        return Objects.equals(id, turma1.id) && Objects.equals(turma, turma1.turma) && Objects.equals(descricao, turma1.descricao) && Objects.equals(disciplinas, turma1.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, turma, descricao, disciplinas);
    }
}
