package repository;

import model.Correntista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}