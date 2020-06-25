package examen.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idproducto;
	@Column(name = "nomprod")
	private String nomprod;
	@Column(name = "precioprod")
	private float precioprod;
	@Column(name = "cantidad")
	private int cantidad;
	@ManyToOne
	@JoinColumn(name="idcate")
	private Categoria categoria;
	
	public long getIdproducto() {
		return idproducto;
	}
	public void setId(long idproducto) {
		this.idproducto = idproducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public float getPrecioprod() {
		return precioprod;
	}
	public void setPrecioprod(float precioprod) {
		this.precioprod = precioprod;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
