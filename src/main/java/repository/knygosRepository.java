package repository;

import entity.Knygos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface knygosRepository extends JpaRepository<Knygos, Integer> {

    Knygos findByPavadinimas (String pavadinimas);
}
