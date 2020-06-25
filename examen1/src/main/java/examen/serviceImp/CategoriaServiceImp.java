package examen.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import examen.dao.CategoriaDao;
import examen.entity.Categoria;
import examen.service.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService{
	@Autowired
	private CategoriaDao catdao;
	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return (List<Categoria>) catdao.findAll();
	}

	@Override
	@Transactional
	public Categoria findById(Long idcat) {
		// TODO Auto-generated method stub
		return catdao.findById(idcat).orElse(null);
	}

	@Override
	@Transactional
	public Categoria save(Categoria cat) {
		// TODO Auto-generated method stub
		return catdao.save(cat);
	}

	@Override
	public void Update(Categoria categoria, long idcate) {
		// TODO Auto-generated method stub
		catdao.findById(idcate).ifPresent((x)->{
			categoria.setIdcate(idcate);
			catdao.save(categoria);
		});
	}

	@Override
	@Transactional
	public void delete(Long idcat) {
		// TODO Auto-generated method stub
		catdao.deleteById(idcat);
	}

}
