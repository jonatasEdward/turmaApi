package com.senai.eng.faculdadeApi.service;

import com.senai.eng.faculdadeApi.model.Aluno;
import com.senai.eng.faculdadeApi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll() {
        return this.repository.findAll();
    }

    public Aluno findById(Integer id) {
        return this.repository.findById(id).orElseThrow();
    }

    public Aluno save(Aluno aluno) {

        return this.repository.save(aluno);
    }

    public Aluno update(Aluno aluno) {
        return this.repository.save(aluno);
    }

    public void delete(Integer id) {
        this.repository.deleteById(id);
    }
}
