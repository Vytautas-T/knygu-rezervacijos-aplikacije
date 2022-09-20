package repository;

import entity.Kategorijos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijosRepository extends JpaRepository<Kategorijos, Integer> {
}
