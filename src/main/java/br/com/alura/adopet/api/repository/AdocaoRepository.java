package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Adocao;
import br.com.alura.adopet.api.model.StatusAdocao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {
    @Query("SELECT a FROM Adocao a JOIN a.pet p WHERE a.status = :status AND p.id = :idPet")
    Optional<Adocao> findPetWithAdocaoStatusAguardandoAvaliacao(Long idPet, StatusAdocao status);

    boolean existsByPetIdAndStatus(Long idPet, StatusAdocao status);
}
