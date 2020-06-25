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

import examen.entity.Producto;
import examen.service.ProductoServive;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/exa")
public class ProductoController {
	@Autowired
	private ProductoServive productoService;
	@GetMapping("/producto")
	public List<Producto> readAll(){
		return productoService.findAll();
	}
	@GetMapping("/producto/{id}")
	public Producto findById(@PathVariable(name = "id") Long id) {
		return productoService.findById(id);
	}
	@PostMapping("/producto")
	public Producto save(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	@DeleteMapping("/producto/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		productoService.delete(id);
	}
	@PutMapping("/producto/{id}")
	private void update(@RequestBody Producto producto,@PathVariable(value = "id") long idproducto) {
		productoService.Update(producto, idproducto);
	}
}
