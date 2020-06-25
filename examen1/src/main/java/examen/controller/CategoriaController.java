package examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.entity.Categoria;
import examen.service.CategoriaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/exa")
public class CategoriaController {
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/categoria")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	@GetMapping("/categoria/{id}")
	public Categoria findById(@PathVariable(name = "id") Long id) {
		return categoriaService.findById(id);
	}
	@PostMapping("/categoria")
	public Categoria save(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	@DeleteMapping("/categoria/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		categoriaService.delete(id);
	}
	@PutMapping("/categoria/{id}")
	private void update(@RequestBody Categoria categoria,@PathVariable(value = "id") long idcategoria) {
		categoriaService.Update(categoria, idcategoria);
	}
}
