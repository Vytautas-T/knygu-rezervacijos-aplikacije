package repository;

import entity.Rezervacijos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervacijosRepository extends JpaRepository<Rezervacijos, Integer> {
}
