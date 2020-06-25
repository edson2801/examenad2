package examen.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import examen.entity.Categoria;

@Repository
public interface CategoriaDao extends CrudRepository<Categoria, Long>{

}
