package com.mapeamento.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapeamento.entities.Aluno;
import com.mapeamento.entities.Turma;
import com.mapeamento.service.AlunoService;
import com.mapeamento.service.TurmaService;

@RestController
@RequestMapping

public class TurmaController {
    
    private final TurmaService turmaService;
  
    public TurmaController(TurmaService turmaService) {
        this.turmaService = turmaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> getProductById(@PathVariable Long id) {
        Turma turma = turmaService.getTurmaById(id);
        if (turma != null) {
            return ResponseEntity.ok(turma);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    public ResponseEntity<List<Turma>> getAllTurma() {
        List<Turma> turma = turmaService.getAllTurmas();
        return ResponseEntity.ok(turma);
    
    }
       
 }
