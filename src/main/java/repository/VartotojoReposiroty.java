package repository;

import entity.Vartotojei;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VartotojoReposiroty extends JpaRepository<Vartotojei,Integer> {
}
