package com.senai.eng.faculdadeApi.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    private String cpf;

    @ManyToMany
    @JoinTable(
            name = "ALUNO_DISCIPLINAS ",  // Tabela intermediária
            joinColumns = @JoinColumn(name = "ALUNO_ID"),  // Chave estrangeira para Estudante
            inverseJoinColumns = @JoinColumn(name = "DISCIPLINA_ID")  // Chave estrangeira para Curso
    )
    private Set<Disciplina> disciplinas;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, String cpf, Set<Disciplina> disciplinas) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", disciplinas=" + disciplinas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(id, aluno.id) && Objects.equals(nome, aluno.nome) && Objects.equals(cpf, aluno.cpf) && Objects.equals(disciplinas, aluno.disciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, disciplinas);
    }

}
