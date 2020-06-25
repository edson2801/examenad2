package examen.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import examen.entity.Producto;

@Repository
public interface ProductoDao extends CrudRepository<Producto, Long>{

}
