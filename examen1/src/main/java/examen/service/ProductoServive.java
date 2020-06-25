package examen.service;

import java.util.List;

import examen.entity.Producto;

public interface ProductoServive {
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
	public void Update(Producto producto,long idproducto);
}
