package br.com.victorgadelha.gestao_vagas.modules.candidate.UseCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.victorgadelha.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.victorgadelha.gestao_vagas.modules.company.dto.ProfileCandidateResponseDTO;

@Service
public class ProfileCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public ProfileCandidateResponseDTO execute(UUID idCandidate) {
        var candidate = this.candidateRepository.findById(idCandidate).orElseThrow(() -> {
            throw new UsernameNotFoundException("User not found");
        });

        var candidateDTO = ProfileCandidateResponseDTO.builder()
                .description(candidate.getDescription()).email(candidate.getEmail())
                .name(candidate.getName()).id(candidate.getId()).username(candidate.getUsername())
                .build();
        return candidateDTO;
    }
}
