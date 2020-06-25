package examen.service;

import java.util.List;

import examen.entity.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();
	public Categoria findById(Long idcat);
	public Categoria save(Categoria cat);
	public void Update(Categoria categoria,long idcate);
	public void delete(Long idcat);
}
