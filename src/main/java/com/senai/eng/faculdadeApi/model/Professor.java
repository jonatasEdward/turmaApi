package com.senai.eng.faculdadeApi.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String email;

    @OneToMany
    @JoinColumn
    private Set<Disciplina> disciplinas;

    public Professor() {
    }

    public Professor(Integer id, String nome, String email, Set<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.disciplinas = disciplinas;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id) && Objects.equals(nome, professor.nome) && Objects.equals(email, professor.email) && Objects.equals(disciplinas, professor.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, disciplinas);
    }
}
