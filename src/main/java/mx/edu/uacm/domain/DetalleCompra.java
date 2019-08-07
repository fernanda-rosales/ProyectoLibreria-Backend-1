package mx.edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToOne;
=======
>>>>>>> 887e2ee5dbb30be535fbcf9641f8b4ae0bc2aade

import lombok.Data;

@Entity
@Data
public class DetalleCompra {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	
	private int cantidadComprada;
	private double descuento;
<<<<<<< HEAD
	
	@ManyToOne
	private Publicacion publicacion;
=======
>>>>>>> 887e2ee5dbb30be535fbcf9641f8b4ae0bc2aade

}
