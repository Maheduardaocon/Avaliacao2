package com.mapeamento.service;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.mapeamento.entities.Turma;
import com.mapeamento.repository.TurmaRepository;

@Service
public class TurmaService {
    private final TurmaRepository turmaRepository;
    
 
    public TurmaService(TurmaRepository turmaRepository) {
        this.turmaRepository = turmaRepository;
    }

    public List<Turma> getAllTurmas() {
        return turmaRepository.findAll();
    }

    public Turma getTurmaById(Long id) {
        Optional<Turma> turma = turmaRepository.findById(id);
        return turma.orElse(null);
    
    }
}
