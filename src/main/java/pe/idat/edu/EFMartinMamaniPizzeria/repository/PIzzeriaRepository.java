package pe.idat.edu.EFMartinMamaniPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.EFMartinMamaniPizzeria.model.Pizzeria;

@Repository
public interface PIzzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}
