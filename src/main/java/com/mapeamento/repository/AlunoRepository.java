package com.mapeamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.mapeamento.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	//Query Methods
	List<Aluno> findByCidade(String cidade);
	Aluno findByRa(String ra);

}