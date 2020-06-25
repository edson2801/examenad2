package examen.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Categoria implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcate;
	@Column(name = "nomcate")
	private String nomcate;
	@OneToMany( targetEntity=Producto.class )
	private List<Producto> productolist;
	
	public long getIdcate() {
		return idcate;
	}
	public void setIdcate(long idcate) {
		this.idcate = idcate;
	}
	public String getNomcate() {
		return nomcate;
	}
	public void setNomcate(String nomcate) {
		this.nomcate = nomcate;
	}
	
	
}
