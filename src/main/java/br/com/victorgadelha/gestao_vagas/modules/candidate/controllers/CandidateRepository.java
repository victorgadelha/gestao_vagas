package br.com.victorgadelha.gestao_vagas.modules.candidate.controllers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateRepository, UUID> {

}
