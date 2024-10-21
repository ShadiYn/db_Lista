package shadyin.proyecto_prueba.repositories;

import org.springframework.data.repository.CrudRepository;
import shadyin.proyecto_prueba.Entities.Persona;

import java.util.List;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {
List<Persona> findAll();
}