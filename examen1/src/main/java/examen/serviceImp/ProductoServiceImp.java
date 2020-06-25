package examen.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examen.dao.ProductoDao;
import examen.entity.Producto;
import examen.service.ProductoServive;


@Service
public class ProductoServiceImp implements ProductoServive{
	@Autowired
	private ProductoDao prodao;
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) prodao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return prodao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return prodao.save(producto);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		prodao.deleteById(id);
	}

	@Override
	@Transactional
	public void Update(Producto producto, long idproducto) {
		// TODO Auto-generated method stub
		prodao.findById(idproducto).ifPresent((x)->{
			producto.setId(idproducto);
			prodao.save(producto);
		});
	}

}
