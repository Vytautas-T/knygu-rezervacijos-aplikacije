package repository;

import entity.Autorius;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoriausRepository extends JpaRepository<Autorius, Integer> {
    Autorius findById(int id);
    Autorius findByUsername(String username);
}
